// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetClusterClusterInfoClusterLogConfDbfsArgs : global::Pulumi.InvokeArgs
    {
        [Input("destination", required: true)]
        public string Destination { get; set; } = null!;

        public GetClusterClusterInfoClusterLogConfDbfsArgs()
        {
        }
        public static new GetClusterClusterInfoClusterLogConfDbfsArgs Empty => new GetClusterClusterInfoClusterLogConfDbfsArgs();
    }
}
