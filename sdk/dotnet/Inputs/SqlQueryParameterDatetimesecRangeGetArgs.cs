// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlQueryParameterDatetimesecRangeGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public SqlQueryParameterDatetimesecRangeGetArgs()
        {
        }
        public static new SqlQueryParameterDatetimesecRangeGetArgs Empty => new SqlQueryParameterDatetimesecRangeGetArgs();
    }
}
