// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MountAbfsArgs : global::Pulumi.ResourceArgs
    {
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        [Input("clientSecretKey", required: true)]
        public Input<string> ClientSecretKey { get; set; } = null!;

        [Input("clientSecretScope", required: true)]
        public Input<string> ClientSecretScope { get; set; } = null!;

        [Input("containerName")]
        public Input<string>? ContainerName { get; set; }

        [Input("directory")]
        public Input<string>? Directory { get; set; }

        [Input("initializeFileSystem", required: true)]
        public Input<bool> InitializeFileSystem { get; set; } = null!;

        [Input("storageAccountName")]
        public Input<string>? StorageAccountName { get; set; }

        [Input("tenantId")]
        public Input<string>? TenantId { get; set; }

        public MountAbfsArgs()
        {
        }
        public static new MountAbfsArgs Empty => new MountAbfsArgs();
    }
}
