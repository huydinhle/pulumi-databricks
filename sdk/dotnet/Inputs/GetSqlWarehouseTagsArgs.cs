// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetSqlWarehouseTagsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("customTags", required: true)]
        private InputList<Inputs.GetSqlWarehouseTagsCustomTagInputArgs>? _customTags;
        public InputList<Inputs.GetSqlWarehouseTagsCustomTagInputArgs> CustomTags
        {
            get => _customTags ?? (_customTags = new InputList<Inputs.GetSqlWarehouseTagsCustomTagInputArgs>());
            set => _customTags = value;
        }

        public GetSqlWarehouseTagsInputArgs()
        {
        }
        public static new GetSqlWarehouseTagsInputArgs Empty => new GetSqlWarehouseTagsInputArgs();
    }
}
