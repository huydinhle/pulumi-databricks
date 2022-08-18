// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class SqlQueryScheduleContinuousArgs : global::Pulumi.ResourceArgs
    {
        [Input("intervalSeconds", required: true)]
        public Input<int> IntervalSeconds { get; set; } = null!;

        [Input("untilDate")]
        public Input<string>? UntilDate { get; set; }

        public SqlQueryScheduleContinuousArgs()
        {
        }
        public static new SqlQueryScheduleContinuousArgs Empty => new SqlQueryScheduleContinuousArgs();
    }
}
