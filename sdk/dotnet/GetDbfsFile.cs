// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetDbfsFile
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var report = Databricks.GetDbfsFile.Invoke(new()
        ///     {
        ///         LimitFileSize = 10240,
        ///         Path = "dbfs:/reports/some.csv",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
        /// </summary>
        public static Task<GetDbfsFileResult> InvokeAsync(GetDbfsFileArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDbfsFileResult>("databricks:index/getDbfsFile:getDbfsFile", args ?? new GetDbfsFileArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var report = Databricks.GetDbfsFile.Invoke(new()
        ///     {
        ///         LimitFileSize = 10240,
        ///         Path = "dbfs:/reports/some.csv",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
        /// * databricks.Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
        /// </summary>
        public static Output<GetDbfsFileResult> Invoke(GetDbfsFileInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDbfsFileResult>("databricks:index/getDbfsFile:getDbfsFile", args ?? new GetDbfsFileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDbfsFileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Do lot load content for files smaller than this in bytes
        /// </summary>
        [Input("limitFileSize", required: true)]
        public bool LimitFileSize { get; set; }

        /// <summary>
        /// Path on DBFS for the file to get content of
        /// </summary>
        [Input("path", required: true)]
        public string Path { get; set; } = null!;

        public GetDbfsFileArgs()
        {
        }
        public static new GetDbfsFileArgs Empty => new GetDbfsFileArgs();
    }

    public sealed class GetDbfsFileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Do lot load content for files smaller than this in bytes
        /// </summary>
        [Input("limitFileSize", required: true)]
        public Input<bool> LimitFileSize { get; set; } = null!;

        /// <summary>
        /// Path on DBFS for the file to get content of
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        public GetDbfsFileInvokeArgs()
        {
        }
        public static new GetDbfsFileInvokeArgs Empty => new GetDbfsFileInvokeArgs();
    }


    [OutputType]
    public sealed class GetDbfsFileResult
    {
        /// <summary>
        /// base64-encoded file contents
        /// </summary>
        public readonly string Content;
        /// <summary>
        /// size of the file in bytes
        /// </summary>
        public readonly int FileSize;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool LimitFileSize;
        public readonly string Path;

        [OutputConstructor]
        private GetDbfsFileResult(
            string content,

            int fileSize,

            string id,

            bool limitFileSize,

            string path)
        {
            Content = content;
            FileSize = fileSize;
            Id = id;
            LimitFileSize = limitFileSize;
            Path = path;
        }
    }
}
