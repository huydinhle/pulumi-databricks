// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MwsNetworksErrorMessageArgs : global::Pulumi.ResourceArgs
    {
        [Input("errorMessage")]
        public Input<string>? ErrorMessage { get; set; }

        [Input("errorType")]
        public Input<string>? ErrorType { get; set; }

        public MwsNetworksErrorMessageArgs()
        {
        }
        public static new MwsNetworksErrorMessageArgs Empty => new MwsNetworksErrorMessageArgs();
    }
}
