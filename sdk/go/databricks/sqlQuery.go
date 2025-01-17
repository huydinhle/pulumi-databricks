// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// To manage [SQLA resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricksSqlAccess` on your Group or databricks_user.
//
// **Note:** documentation for this resource is a work in progress.
//
// A query may have one or more visualizations.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := databricks.NewSqlQuery(ctx, "q1", &databricks.SqlQueryArgs{
//				DataSourceId: pulumi.Any(databricks_sql_endpoint.Example.Data_source_id),
//				Query:        pulumi.String("SELECT {{ p1 }} AS p1, 2 as p2"),
//				RunAsRole:    pulumi.String("viewer"),
//				Schedule: &SqlQueryScheduleArgs{
//					Continuous: &SqlQueryScheduleContinuousArgs{
//						IntervalSeconds: 5 * 60,
//					},
//				},
//				Parameters: SqlQueryParameterArray{
//					&SqlQueryParameterArgs{
//						Name:  pulumi.String("p1"),
//						Title: pulumi.String("Title for p1"),
//						Text: &SqlQueryParameterTextArgs{
//							Value: pulumi.String("default"),
//						},
//					},
//				},
//				Tags: pulumi.StringArray{
//					pulumi.String("t1"),
//					pulumi.String("t2"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Example permission to share query with all users:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := databricks.NewPermissions(ctx, "q1", &databricks.PermissionsArgs{
//				SqlQueryId: pulumi.Any(databricks_sql_query.Q1.Id),
//				AccessControls: PermissionsAccessControlArray{
//					&PermissionsAccessControlArgs{
//						GroupName:       pulumi.Any(data.Databricks_group.Users.Display_name),
//						PermissionLevel: pulumi.String("CAN_RUN"),
//					},
//					&PermissionsAccessControlArgs{
//						GroupName:       pulumi.Any(data.Databricks_group.Team.Display_name),
//						PermissionLevel: pulumi.String("CAN_EDIT"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
// * SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
// * SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all SqlEndpoint of workspace.
// * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
//
// ## Import
//
// You can import a `databricks_sql_query` resource with ID like the followingbash
//
// ```sh
//
//	$ pulumi import databricks:index/sqlQuery:SqlQuery this <query-id>
//
// ```
type SqlQuery struct {
	pulumi.CustomResourceState

	DataSourceId pulumi.StringOutput          `pulumi:"dataSourceId"`
	Description  pulumi.StringPtrOutput       `pulumi:"description"`
	Name         pulumi.StringOutput          `pulumi:"name"`
	Parameters   SqlQueryParameterArrayOutput `pulumi:"parameters"`
	Query        pulumi.StringOutput          `pulumi:"query"`
	RunAsRole    pulumi.StringPtrOutput       `pulumi:"runAsRole"`
	Schedule     SqlQuerySchedulePtrOutput    `pulumi:"schedule"`
	Tags         pulumi.StringArrayOutput     `pulumi:"tags"`
}

// NewSqlQuery registers a new resource with the given unique name, arguments, and options.
func NewSqlQuery(ctx *pulumi.Context,
	name string, args *SqlQueryArgs, opts ...pulumi.ResourceOption) (*SqlQuery, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataSourceId == nil {
		return nil, errors.New("invalid value for required argument 'DataSourceId'")
	}
	if args.Query == nil {
		return nil, errors.New("invalid value for required argument 'Query'")
	}
	var resource SqlQuery
	err := ctx.RegisterResource("databricks:index/sqlQuery:SqlQuery", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSqlQuery gets an existing SqlQuery resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSqlQuery(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SqlQueryState, opts ...pulumi.ResourceOption) (*SqlQuery, error) {
	var resource SqlQuery
	err := ctx.ReadResource("databricks:index/sqlQuery:SqlQuery", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SqlQuery resources.
type sqlQueryState struct {
	DataSourceId *string             `pulumi:"dataSourceId"`
	Description  *string             `pulumi:"description"`
	Name         *string             `pulumi:"name"`
	Parameters   []SqlQueryParameter `pulumi:"parameters"`
	Query        *string             `pulumi:"query"`
	RunAsRole    *string             `pulumi:"runAsRole"`
	Schedule     *SqlQuerySchedule   `pulumi:"schedule"`
	Tags         []string            `pulumi:"tags"`
}

type SqlQueryState struct {
	DataSourceId pulumi.StringPtrInput
	Description  pulumi.StringPtrInput
	Name         pulumi.StringPtrInput
	Parameters   SqlQueryParameterArrayInput
	Query        pulumi.StringPtrInput
	RunAsRole    pulumi.StringPtrInput
	Schedule     SqlQuerySchedulePtrInput
	Tags         pulumi.StringArrayInput
}

func (SqlQueryState) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlQueryState)(nil)).Elem()
}

type sqlQueryArgs struct {
	DataSourceId string              `pulumi:"dataSourceId"`
	Description  *string             `pulumi:"description"`
	Name         *string             `pulumi:"name"`
	Parameters   []SqlQueryParameter `pulumi:"parameters"`
	Query        string              `pulumi:"query"`
	RunAsRole    *string             `pulumi:"runAsRole"`
	Schedule     *SqlQuerySchedule   `pulumi:"schedule"`
	Tags         []string            `pulumi:"tags"`
}

// The set of arguments for constructing a SqlQuery resource.
type SqlQueryArgs struct {
	DataSourceId pulumi.StringInput
	Description  pulumi.StringPtrInput
	Name         pulumi.StringPtrInput
	Parameters   SqlQueryParameterArrayInput
	Query        pulumi.StringInput
	RunAsRole    pulumi.StringPtrInput
	Schedule     SqlQuerySchedulePtrInput
	Tags         pulumi.StringArrayInput
}

func (SqlQueryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlQueryArgs)(nil)).Elem()
}

type SqlQueryInput interface {
	pulumi.Input

	ToSqlQueryOutput() SqlQueryOutput
	ToSqlQueryOutputWithContext(ctx context.Context) SqlQueryOutput
}

func (*SqlQuery) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlQuery)(nil)).Elem()
}

func (i *SqlQuery) ToSqlQueryOutput() SqlQueryOutput {
	return i.ToSqlQueryOutputWithContext(context.Background())
}

func (i *SqlQuery) ToSqlQueryOutputWithContext(ctx context.Context) SqlQueryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlQueryOutput)
}

// SqlQueryArrayInput is an input type that accepts SqlQueryArray and SqlQueryArrayOutput values.
// You can construct a concrete instance of `SqlQueryArrayInput` via:
//
//	SqlQueryArray{ SqlQueryArgs{...} }
type SqlQueryArrayInput interface {
	pulumi.Input

	ToSqlQueryArrayOutput() SqlQueryArrayOutput
	ToSqlQueryArrayOutputWithContext(context.Context) SqlQueryArrayOutput
}

type SqlQueryArray []SqlQueryInput

func (SqlQueryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlQuery)(nil)).Elem()
}

func (i SqlQueryArray) ToSqlQueryArrayOutput() SqlQueryArrayOutput {
	return i.ToSqlQueryArrayOutputWithContext(context.Background())
}

func (i SqlQueryArray) ToSqlQueryArrayOutputWithContext(ctx context.Context) SqlQueryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlQueryArrayOutput)
}

// SqlQueryMapInput is an input type that accepts SqlQueryMap and SqlQueryMapOutput values.
// You can construct a concrete instance of `SqlQueryMapInput` via:
//
//	SqlQueryMap{ "key": SqlQueryArgs{...} }
type SqlQueryMapInput interface {
	pulumi.Input

	ToSqlQueryMapOutput() SqlQueryMapOutput
	ToSqlQueryMapOutputWithContext(context.Context) SqlQueryMapOutput
}

type SqlQueryMap map[string]SqlQueryInput

func (SqlQueryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlQuery)(nil)).Elem()
}

func (i SqlQueryMap) ToSqlQueryMapOutput() SqlQueryMapOutput {
	return i.ToSqlQueryMapOutputWithContext(context.Background())
}

func (i SqlQueryMap) ToSqlQueryMapOutputWithContext(ctx context.Context) SqlQueryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlQueryMapOutput)
}

type SqlQueryOutput struct{ *pulumi.OutputState }

func (SqlQueryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlQuery)(nil)).Elem()
}

func (o SqlQueryOutput) ToSqlQueryOutput() SqlQueryOutput {
	return o
}

func (o SqlQueryOutput) ToSqlQueryOutputWithContext(ctx context.Context) SqlQueryOutput {
	return o
}

func (o SqlQueryOutput) DataSourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringOutput { return v.DataSourceId }).(pulumi.StringOutput)
}

func (o SqlQueryOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o SqlQueryOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o SqlQueryOutput) Parameters() SqlQueryParameterArrayOutput {
	return o.ApplyT(func(v *SqlQuery) SqlQueryParameterArrayOutput { return v.Parameters }).(SqlQueryParameterArrayOutput)
}

func (o SqlQueryOutput) Query() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringOutput { return v.Query }).(pulumi.StringOutput)
}

func (o SqlQueryOutput) RunAsRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringPtrOutput { return v.RunAsRole }).(pulumi.StringPtrOutput)
}

func (o SqlQueryOutput) Schedule() SqlQuerySchedulePtrOutput {
	return o.ApplyT(func(v *SqlQuery) SqlQuerySchedulePtrOutput { return v.Schedule }).(SqlQuerySchedulePtrOutput)
}

func (o SqlQueryOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type SqlQueryArrayOutput struct{ *pulumi.OutputState }

func (SqlQueryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlQuery)(nil)).Elem()
}

func (o SqlQueryArrayOutput) ToSqlQueryArrayOutput() SqlQueryArrayOutput {
	return o
}

func (o SqlQueryArrayOutput) ToSqlQueryArrayOutputWithContext(ctx context.Context) SqlQueryArrayOutput {
	return o
}

func (o SqlQueryArrayOutput) Index(i pulumi.IntInput) SqlQueryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SqlQuery {
		return vs[0].([]*SqlQuery)[vs[1].(int)]
	}).(SqlQueryOutput)
}

type SqlQueryMapOutput struct{ *pulumi.OutputState }

func (SqlQueryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlQuery)(nil)).Elem()
}

func (o SqlQueryMapOutput) ToSqlQueryMapOutput() SqlQueryMapOutput {
	return o
}

func (o SqlQueryMapOutput) ToSqlQueryMapOutputWithContext(ctx context.Context) SqlQueryMapOutput {
	return o
}

func (o SqlQueryMapOutput) MapIndex(k pulumi.StringInput) SqlQueryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SqlQuery {
		return vs[0].(map[string]*SqlQuery)[vs[1].(string)]
	}).(SqlQueryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SqlQueryInput)(nil)).Elem(), &SqlQuery{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlQueryArrayInput)(nil)).Elem(), SqlQueryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlQueryMapInput)(nil)).Elem(), SqlQueryMap{})
	pulumi.RegisterOutputType(SqlQueryOutput{})
	pulumi.RegisterOutputType(SqlQueryArrayOutput{})
	pulumi.RegisterOutputType(SqlQueryMapOutput{})
}
