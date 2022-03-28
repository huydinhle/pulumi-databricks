// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource configures the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all SqlEndpoint of workspace. *Please note that changing parameters of this resources will restart all running databricks_sql_endpoint.*  To use this resource you need to be an administrator.
//
// ## Example Usage
// ### AWS example
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := databricks.NewSqlGlobalConfig(ctx, "this", &databricks.SqlGlobalConfigArgs{
// 			SecurityPolicy:     pulumi.String("DATA_ACCESS_CONTROL"),
// 			InstanceProfileArn: pulumi.String("arn:...."),
// 			DataAccessConfig: pulumi.AnyMap{
// 				"spark.sql.session.timeZone": pulumi.Any("UTC"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Azure example
//
// For Azure you should use the `dataAccessConfig` to provide the service principal configuration. You can use the Databricks SQL Admin Console UI to help you generate the right configuration values.
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := databricks.NewSqlGlobalConfig(ctx, "this", &databricks.SqlGlobalConfigArgs{
// 			SecurityPolicy: pulumi.String("DATA_ACCESS_CONTROL"),
// 			DataAccessConfig: pulumi.AnyMap{
// 				"spark.hadoop.fs.azure.account.auth.type":              pulumi.Any("OAuth"),
// 				"spark.hadoop.fs.azure.account.oauth.provider.type":    pulumi.Any("org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider"),
// 				"spark.hadoop.fs.azure.account.oauth2.client.id":       pulumi.Any(_var.Tenant_id),
// 				"spark.hadoop.fs.azure.account.oauth2.client.secret":   pulumi.Any(fmt.Sprintf("%v%v%v%v%v", "{{secrets/", local.Secret_scope, "/", local.Secret_key, "}}")),
// 				"spark.hadoop.fs.azure.account.oauth2.client.endpoint": pulumi.Any(fmt.Sprintf("%v%v%v", "https://login.microsoftonline.com/", _var.Tenant_id, "/oauth2/token")),
// 			},
// 			SqlConfigParams: pulumi.AnyMap{
// 				"ANSI_MODE": pulumi.Any("true"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
// * SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
// * SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
// * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
//
// ## Import
//
// You can import a `databricks_sql_global_config` resource with command like the following (you need to use `global` as ID)bash
//
// ```sh
//  $ pulumi import databricks:index/sqlGlobalConfig:SqlGlobalConfig this global
// ```
type SqlGlobalConfig struct {
	pulumi.CustomResourceState

	// - data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
	DataAccessConfig        pulumi.MapOutput     `pulumi:"dataAccessConfig"`
	EnableServerlessCompute pulumi.BoolPtrOutput `pulumi:"enableServerlessCompute"`
	// - InstanceProfile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
	InstanceProfileArn pulumi.StringPtrOutput `pulumi:"instanceProfileArn"`
	// - The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
	SecurityPolicy pulumi.StringPtrOutput `pulumi:"securityPolicy"`
	// - SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
	SqlConfigParams pulumi.MapOutput `pulumi:"sqlConfigParams"`
}

// NewSqlGlobalConfig registers a new resource with the given unique name, arguments, and options.
func NewSqlGlobalConfig(ctx *pulumi.Context,
	name string, args *SqlGlobalConfigArgs, opts ...pulumi.ResourceOption) (*SqlGlobalConfig, error) {
	if args == nil {
		args = &SqlGlobalConfigArgs{}
	}

	var resource SqlGlobalConfig
	err := ctx.RegisterResource("databricks:index/sqlGlobalConfig:SqlGlobalConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSqlGlobalConfig gets an existing SqlGlobalConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSqlGlobalConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SqlGlobalConfigState, opts ...pulumi.ResourceOption) (*SqlGlobalConfig, error) {
	var resource SqlGlobalConfig
	err := ctx.ReadResource("databricks:index/sqlGlobalConfig:SqlGlobalConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SqlGlobalConfig resources.
type sqlGlobalConfigState struct {
	// - data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
	DataAccessConfig        map[string]interface{} `pulumi:"dataAccessConfig"`
	EnableServerlessCompute *bool                  `pulumi:"enableServerlessCompute"`
	// - InstanceProfile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
	InstanceProfileArn *string `pulumi:"instanceProfileArn"`
	// - The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
	SecurityPolicy *string `pulumi:"securityPolicy"`
	// - SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
	SqlConfigParams map[string]interface{} `pulumi:"sqlConfigParams"`
}

type SqlGlobalConfigState struct {
	// - data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
	DataAccessConfig        pulumi.MapInput
	EnableServerlessCompute pulumi.BoolPtrInput
	// - InstanceProfile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
	InstanceProfileArn pulumi.StringPtrInput
	// - The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
	SecurityPolicy pulumi.StringPtrInput
	// - SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
	SqlConfigParams pulumi.MapInput
}

func (SqlGlobalConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlGlobalConfigState)(nil)).Elem()
}

type sqlGlobalConfigArgs struct {
	// - data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
	DataAccessConfig        map[string]interface{} `pulumi:"dataAccessConfig"`
	EnableServerlessCompute *bool                  `pulumi:"enableServerlessCompute"`
	// - InstanceProfile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
	InstanceProfileArn *string `pulumi:"instanceProfileArn"`
	// - The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
	SecurityPolicy *string `pulumi:"securityPolicy"`
	// - SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
	SqlConfigParams map[string]interface{} `pulumi:"sqlConfigParams"`
}

// The set of arguments for constructing a SqlGlobalConfig resource.
type SqlGlobalConfigArgs struct {
	// - data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
	DataAccessConfig        pulumi.MapInput
	EnableServerlessCompute pulumi.BoolPtrInput
	// - InstanceProfile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
	InstanceProfileArn pulumi.StringPtrInput
	// - The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
	SecurityPolicy pulumi.StringPtrInput
	// - SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
	SqlConfigParams pulumi.MapInput
}

func (SqlGlobalConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlGlobalConfigArgs)(nil)).Elem()
}

type SqlGlobalConfigInput interface {
	pulumi.Input

	ToSqlGlobalConfigOutput() SqlGlobalConfigOutput
	ToSqlGlobalConfigOutputWithContext(ctx context.Context) SqlGlobalConfigOutput
}

func (*SqlGlobalConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlGlobalConfig)(nil)).Elem()
}

func (i *SqlGlobalConfig) ToSqlGlobalConfigOutput() SqlGlobalConfigOutput {
	return i.ToSqlGlobalConfigOutputWithContext(context.Background())
}

func (i *SqlGlobalConfig) ToSqlGlobalConfigOutputWithContext(ctx context.Context) SqlGlobalConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlGlobalConfigOutput)
}

// SqlGlobalConfigArrayInput is an input type that accepts SqlGlobalConfigArray and SqlGlobalConfigArrayOutput values.
// You can construct a concrete instance of `SqlGlobalConfigArrayInput` via:
//
//          SqlGlobalConfigArray{ SqlGlobalConfigArgs{...} }
type SqlGlobalConfigArrayInput interface {
	pulumi.Input

	ToSqlGlobalConfigArrayOutput() SqlGlobalConfigArrayOutput
	ToSqlGlobalConfigArrayOutputWithContext(context.Context) SqlGlobalConfigArrayOutput
}

type SqlGlobalConfigArray []SqlGlobalConfigInput

func (SqlGlobalConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlGlobalConfig)(nil)).Elem()
}

func (i SqlGlobalConfigArray) ToSqlGlobalConfigArrayOutput() SqlGlobalConfigArrayOutput {
	return i.ToSqlGlobalConfigArrayOutputWithContext(context.Background())
}

func (i SqlGlobalConfigArray) ToSqlGlobalConfigArrayOutputWithContext(ctx context.Context) SqlGlobalConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlGlobalConfigArrayOutput)
}

// SqlGlobalConfigMapInput is an input type that accepts SqlGlobalConfigMap and SqlGlobalConfigMapOutput values.
// You can construct a concrete instance of `SqlGlobalConfigMapInput` via:
//
//          SqlGlobalConfigMap{ "key": SqlGlobalConfigArgs{...} }
type SqlGlobalConfigMapInput interface {
	pulumi.Input

	ToSqlGlobalConfigMapOutput() SqlGlobalConfigMapOutput
	ToSqlGlobalConfigMapOutputWithContext(context.Context) SqlGlobalConfigMapOutput
}

type SqlGlobalConfigMap map[string]SqlGlobalConfigInput

func (SqlGlobalConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlGlobalConfig)(nil)).Elem()
}

func (i SqlGlobalConfigMap) ToSqlGlobalConfigMapOutput() SqlGlobalConfigMapOutput {
	return i.ToSqlGlobalConfigMapOutputWithContext(context.Background())
}

func (i SqlGlobalConfigMap) ToSqlGlobalConfigMapOutputWithContext(ctx context.Context) SqlGlobalConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlGlobalConfigMapOutput)
}

type SqlGlobalConfigOutput struct{ *pulumi.OutputState }

func (SqlGlobalConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlGlobalConfig)(nil)).Elem()
}

func (o SqlGlobalConfigOutput) ToSqlGlobalConfigOutput() SqlGlobalConfigOutput {
	return o
}

func (o SqlGlobalConfigOutput) ToSqlGlobalConfigOutputWithContext(ctx context.Context) SqlGlobalConfigOutput {
	return o
}

type SqlGlobalConfigArrayOutput struct{ *pulumi.OutputState }

func (SqlGlobalConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlGlobalConfig)(nil)).Elem()
}

func (o SqlGlobalConfigArrayOutput) ToSqlGlobalConfigArrayOutput() SqlGlobalConfigArrayOutput {
	return o
}

func (o SqlGlobalConfigArrayOutput) ToSqlGlobalConfigArrayOutputWithContext(ctx context.Context) SqlGlobalConfigArrayOutput {
	return o
}

func (o SqlGlobalConfigArrayOutput) Index(i pulumi.IntInput) SqlGlobalConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SqlGlobalConfig {
		return vs[0].([]*SqlGlobalConfig)[vs[1].(int)]
	}).(SqlGlobalConfigOutput)
}

type SqlGlobalConfigMapOutput struct{ *pulumi.OutputState }

func (SqlGlobalConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlGlobalConfig)(nil)).Elem()
}

func (o SqlGlobalConfigMapOutput) ToSqlGlobalConfigMapOutput() SqlGlobalConfigMapOutput {
	return o
}

func (o SqlGlobalConfigMapOutput) ToSqlGlobalConfigMapOutputWithContext(ctx context.Context) SqlGlobalConfigMapOutput {
	return o
}

func (o SqlGlobalConfigMapOutput) MapIndex(k pulumi.StringInput) SqlGlobalConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SqlGlobalConfig {
		return vs[0].(map[string]*SqlGlobalConfig)[vs[1].(string)]
	}).(SqlGlobalConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SqlGlobalConfigInput)(nil)).Elem(), &SqlGlobalConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlGlobalConfigArrayInput)(nil)).Elem(), SqlGlobalConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlGlobalConfigMapInput)(nil)).Elem(), SqlGlobalConfigMap{})
	pulumi.RegisterOutputType(SqlGlobalConfigOutput{})
	pulumi.RegisterOutputType(SqlGlobalConfigArrayOutput{})
	pulumi.RegisterOutputType(SqlGlobalConfigMapOutput{})
}