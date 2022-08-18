// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetServicePrincipals
    {
        /// <summary>
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
        /// * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        /// * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
        /// * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
        /// * databricks_group_member to attach users and groups as group members.
        /// * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        /// * databricks_service principal to manage service principals
        /// </summary>
        public static Task<GetServicePrincipalsResult> InvokeAsync(GetServicePrincipalsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServicePrincipalsResult>("databricks:index/getServicePrincipals:getServicePrincipals", args ?? new GetServicePrincipalsArgs(), options.WithDefaults());

        /// <summary>
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
        /// * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
        /// * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
        /// * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
        /// * databricks_group_member to attach users and groups as group members.
        /// * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        /// * databricks_service principal to manage service principals
        /// </summary>
        public static Output<GetServicePrincipalsResult> Invoke(GetServicePrincipalsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetServicePrincipalsResult>("databricks:index/getServicePrincipals:getServicePrincipals", args ?? new GetServicePrincipalsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServicePrincipalsArgs : global::Pulumi.InvokeArgs
    {
        [Input("applicationIds")]
        private List<string>? _applicationIds;

        /// <summary>
        /// List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
        /// </summary>
        public List<string> ApplicationIds
        {
            get => _applicationIds ?? (_applicationIds = new List<string>());
            set => _applicationIds = value;
        }

        /// <summary>
        /// Only return databricks.ServicePrincipal display name that match the given name string
        /// </summary>
        [Input("displayNameContains")]
        public string? DisplayNameContains { get; set; }

        public GetServicePrincipalsArgs()
        {
        }
        public static new GetServicePrincipalsArgs Empty => new GetServicePrincipalsArgs();
    }

    public sealed class GetServicePrincipalsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("applicationIds")]
        private InputList<string>? _applicationIds;

        /// <summary>
        /// List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
        /// </summary>
        public InputList<string> ApplicationIds
        {
            get => _applicationIds ?? (_applicationIds = new InputList<string>());
            set => _applicationIds = value;
        }

        /// <summary>
        /// Only return databricks.ServicePrincipal display name that match the given name string
        /// </summary>
        [Input("displayNameContains")]
        public Input<string>? DisplayNameContains { get; set; }

        public GetServicePrincipalsInvokeArgs()
        {
        }
        public static new GetServicePrincipalsInvokeArgs Empty => new GetServicePrincipalsInvokeArgs();
    }


    [OutputType]
    public sealed class GetServicePrincipalsResult
    {
        /// <summary>
        /// List of `application_ids` of service principals Individual service principal can be retrieved using databricks.ServicePrincipal data source
        /// </summary>
        public readonly ImmutableArray<string> ApplicationIds;
        public readonly string DisplayNameContains;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetServicePrincipalsResult(
            ImmutableArray<string> applicationIds,

            string displayNameContains,

            string id)
        {
            ApplicationIds = applicationIds;
            DisplayNameContains = displayNameContains;
            Id = id;
        }
    }
}
