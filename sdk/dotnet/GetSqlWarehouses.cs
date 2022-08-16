// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetSqlWarehouses
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Retrieve all SQL warehouses on this workspace on AWS or GCP:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetSqlWarehouses.Invoke();
        /// 
        /// });
        /// ```
        /// 
        /// Retrieve all clusters with "Shared" in their cluster name on this Azure Databricks workspace:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var allShared = Databricks.GetSqlWarehouses.Invoke(new()
        ///     {
        ///         WarehouseNameContains = "shared",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are often used in the same context:
        /// 
        /// * End to end workspace management guide.
        /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
        /// * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
        /// * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.SqlEndpoint of workspace.
        /// * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
        /// </summary>
        public static Task<GetSqlWarehousesResult> InvokeAsync(GetSqlWarehousesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSqlWarehousesResult>("databricks:index/getSqlWarehouses:getSqlWarehouses", args ?? new GetSqlWarehousesArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Retrieve all SQL warehouses on this workspace on AWS or GCP:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Databricks.GetSqlWarehouses.Invoke();
        /// 
        /// });
        /// ```
        /// 
        /// Retrieve all clusters with "Shared" in their cluster name on this Azure Databricks workspace:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var allShared = Databricks.GetSqlWarehouses.Invoke(new()
        ///     {
        ///         WarehouseNameContains = "shared",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are often used in the same context:
        /// 
        /// * End to end workspace management guide.
        /// * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
        /// * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
        /// * databricks.SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.SqlEndpoint of workspace.
        /// * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
        /// </summary>
        public static Output<GetSqlWarehousesResult> Invoke(GetSqlWarehousesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetSqlWarehousesResult>("databricks:index/getSqlWarehouses:getSqlWarehouses", args ?? new GetSqlWarehousesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSqlWarehousesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// list of databricks.SqlEndpoint ids
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Only return databricks.SqlEndpoint ids that match the given name string.
        /// </summary>
        [Input("warehouseNameContains")]
        public string? WarehouseNameContains { get; set; }

        public GetSqlWarehousesArgs()
        {
        }
        public static new GetSqlWarehousesArgs Empty => new GetSqlWarehousesArgs();
    }

    public sealed class GetSqlWarehousesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// list of databricks.SqlEndpoint ids
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Only return databricks.SqlEndpoint ids that match the given name string.
        /// </summary>
        [Input("warehouseNameContains")]
        public Input<string>? WarehouseNameContains { get; set; }

        public GetSqlWarehousesInvokeArgs()
        {
        }
        public static new GetSqlWarehousesInvokeArgs Empty => new GetSqlWarehousesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSqlWarehousesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// list of databricks.SqlEndpoint ids
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? WarehouseNameContains;

        [OutputConstructor]
        private GetSqlWarehousesResult(
            string id,

            ImmutableArray<string> ids,

            string? warehouseNameContains)
        {
            Id = id;
            Ids = ids;
            WarehouseNameContains = warehouseNameContains;
        }
    }
}
