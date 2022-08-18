// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// ## Import
    /// 
    /// The resource notebook can be imported using notebook path bash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/notebook:Notebook this /path/to/notebook
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/notebook:Notebook")]
    public partial class Notebook : global::Pulumi.CustomResource
    {
        [Output("contentBase64")]
        public Output<string?> ContentBase64 { get; private set; } = null!;

        [Output("format")]
        public Output<string?> Format { get; private set; } = null!;

        /// <summary>
        /// One of `SCALA`, `PYTHON`, `SQL`, `R`.
        /// </summary>
        [Output("language")]
        public Output<string?> Language { get; private set; } = null!;

        [Output("md5")]
        public Output<string?> Md5 { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for a NOTEBOOK
        /// </summary>
        [Output("objectId")]
        public Output<int> ObjectId { get; private set; } = null!;

        [Output("objectType")]
        public Output<string> ObjectType { get; private set; } = null!;

        /// <summary>
        /// The absolute path of the notebook or directory, beginning with "/", e.g. "/Demo".
        /// </summary>
        [Output("path")]
        public Output<string> Path { get; private set; } = null!;

        /// <summary>
        /// Path to notebook in source code format on local filesystem. Conflicts with `content_base64`.
        /// </summary>
        [Output("source")]
        public Output<string?> Source { get; private set; } = null!;

        /// <summary>
        /// Routable URL of the notebook
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a Notebook resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Notebook(string name, NotebookArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/notebook:Notebook", name, args ?? new NotebookArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Notebook(string name, Input<string> id, NotebookState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/notebook:Notebook", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Notebook resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Notebook Get(string name, Input<string> id, NotebookState? state = null, CustomResourceOptions? options = null)
        {
            return new Notebook(name, id, state, options);
        }
    }

    public sealed class NotebookArgs : global::Pulumi.ResourceArgs
    {
        [Input("contentBase64")]
        public Input<string>? ContentBase64 { get; set; }

        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// One of `SCALA`, `PYTHON`, `SQL`, `R`.
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        [Input("md5")]
        public Input<string>? Md5 { get; set; }

        /// <summary>
        /// Unique identifier for a NOTEBOOK
        /// </summary>
        [Input("objectId")]
        public Input<int>? ObjectId { get; set; }

        [Input("objectType")]
        public Input<string>? ObjectType { get; set; }

        /// <summary>
        /// The absolute path of the notebook or directory, beginning with "/", e.g. "/Demo".
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        /// <summary>
        /// Path to notebook in source code format on local filesystem. Conflicts with `content_base64`.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        public NotebookArgs()
        {
        }
        public static new NotebookArgs Empty => new NotebookArgs();
    }

    public sealed class NotebookState : global::Pulumi.ResourceArgs
    {
        [Input("contentBase64")]
        public Input<string>? ContentBase64 { get; set; }

        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// One of `SCALA`, `PYTHON`, `SQL`, `R`.
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        [Input("md5")]
        public Input<string>? Md5 { get; set; }

        /// <summary>
        /// Unique identifier for a NOTEBOOK
        /// </summary>
        [Input("objectId")]
        public Input<int>? ObjectId { get; set; }

        [Input("objectType")]
        public Input<string>? ObjectType { get; set; }

        /// <summary>
        /// The absolute path of the notebook or directory, beginning with "/", e.g. "/Demo".
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Path to notebook in source code format on local filesystem. Conflicts with `content_base64`.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// Routable URL of the notebook
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public NotebookState()
        {
        }
        public static new NotebookState Empty => new NotebookState();
    }
}
