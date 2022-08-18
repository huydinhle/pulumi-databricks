// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// These resources are invoked in the account context. Provider must have `accountId` attribute configured.
//
// ## Example Usage
//
// In account context, adding account-level group to a workspace:
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
//			dataEng, err := databricks.NewGroup(ctx, "dataEng", nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewMwsPermissionAssignment(ctx, "addAdminGroup", &databricks.MwsPermissionAssignmentArgs{
//				WorkspaceId: pulumi.Any(databricks_mws_workspaces.This.Workspace_id),
//				PrincipalId: dataEng.ID(),
//				Permissions: pulumi.StringArray{
//					pulumi.String("ADMIN"),
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
// In account context, adding account-level user to a workspace:
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
//			me, err := databricks.NewUser(ctx, "me", &databricks.UserArgs{
//				UserName: pulumi.String("me@example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewMwsPermissionAssignment(ctx, "addUser", &databricks.MwsPermissionAssignmentArgs{
//				WorkspaceId: pulumi.Any(databricks_mws_workspaces.This.Workspace_id),
//				PrincipalId: me.ID(),
//				Permissions: pulumi.StringArray{
//					pulumi.String("USER"),
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
// In account context, adding account-level service principal to a workspace:
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
//			sp, err := databricks.NewServicePrincipal(ctx, "sp", &databricks.ServicePrincipalArgs{
//				DisplayName: pulumi.String("Automation-only SP"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewMwsPermissionAssignment(ctx, "addAdminSpn", &databricks.MwsPermissionAssignmentArgs{
//				WorkspaceId: pulumi.Any(databricks_mws_workspaces.This.Workspace_id),
//				PrincipalId: sp.ID(),
//				Permissions: pulumi.StringArray{
//					pulumi.String("ADMIN"),
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
type MwsPermissionAssignment struct {
	pulumi.CustomResourceState

	Permissions pulumi.StringArrayOutput `pulumi:"permissions"`
	PrincipalId pulumi.IntOutput         `pulumi:"principalId"`
	WorkspaceId pulumi.IntOutput         `pulumi:"workspaceId"`
}

// NewMwsPermissionAssignment registers a new resource with the given unique name, arguments, and options.
func NewMwsPermissionAssignment(ctx *pulumi.Context,
	name string, args *MwsPermissionAssignmentArgs, opts ...pulumi.ResourceOption) (*MwsPermissionAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Permissions == nil {
		return nil, errors.New("invalid value for required argument 'Permissions'")
	}
	if args.PrincipalId == nil {
		return nil, errors.New("invalid value for required argument 'PrincipalId'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	var resource MwsPermissionAssignment
	err := ctx.RegisterResource("databricks:index/mwsPermissionAssignment:MwsPermissionAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMwsPermissionAssignment gets an existing MwsPermissionAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMwsPermissionAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MwsPermissionAssignmentState, opts ...pulumi.ResourceOption) (*MwsPermissionAssignment, error) {
	var resource MwsPermissionAssignment
	err := ctx.ReadResource("databricks:index/mwsPermissionAssignment:MwsPermissionAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MwsPermissionAssignment resources.
type mwsPermissionAssignmentState struct {
	Permissions []string `pulumi:"permissions"`
	PrincipalId *int     `pulumi:"principalId"`
	WorkspaceId *int     `pulumi:"workspaceId"`
}

type MwsPermissionAssignmentState struct {
	Permissions pulumi.StringArrayInput
	PrincipalId pulumi.IntPtrInput
	WorkspaceId pulumi.IntPtrInput
}

func (MwsPermissionAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsPermissionAssignmentState)(nil)).Elem()
}

type mwsPermissionAssignmentArgs struct {
	Permissions []string `pulumi:"permissions"`
	PrincipalId int      `pulumi:"principalId"`
	WorkspaceId int      `pulumi:"workspaceId"`
}

// The set of arguments for constructing a MwsPermissionAssignment resource.
type MwsPermissionAssignmentArgs struct {
	Permissions pulumi.StringArrayInput
	PrincipalId pulumi.IntInput
	WorkspaceId pulumi.IntInput
}

func (MwsPermissionAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsPermissionAssignmentArgs)(nil)).Elem()
}

type MwsPermissionAssignmentInput interface {
	pulumi.Input

	ToMwsPermissionAssignmentOutput() MwsPermissionAssignmentOutput
	ToMwsPermissionAssignmentOutputWithContext(ctx context.Context) MwsPermissionAssignmentOutput
}

func (*MwsPermissionAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsPermissionAssignment)(nil)).Elem()
}

func (i *MwsPermissionAssignment) ToMwsPermissionAssignmentOutput() MwsPermissionAssignmentOutput {
	return i.ToMwsPermissionAssignmentOutputWithContext(context.Background())
}

func (i *MwsPermissionAssignment) ToMwsPermissionAssignmentOutputWithContext(ctx context.Context) MwsPermissionAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsPermissionAssignmentOutput)
}

// MwsPermissionAssignmentArrayInput is an input type that accepts MwsPermissionAssignmentArray and MwsPermissionAssignmentArrayOutput values.
// You can construct a concrete instance of `MwsPermissionAssignmentArrayInput` via:
//
//	MwsPermissionAssignmentArray{ MwsPermissionAssignmentArgs{...} }
type MwsPermissionAssignmentArrayInput interface {
	pulumi.Input

	ToMwsPermissionAssignmentArrayOutput() MwsPermissionAssignmentArrayOutput
	ToMwsPermissionAssignmentArrayOutputWithContext(context.Context) MwsPermissionAssignmentArrayOutput
}

type MwsPermissionAssignmentArray []MwsPermissionAssignmentInput

func (MwsPermissionAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsPermissionAssignment)(nil)).Elem()
}

func (i MwsPermissionAssignmentArray) ToMwsPermissionAssignmentArrayOutput() MwsPermissionAssignmentArrayOutput {
	return i.ToMwsPermissionAssignmentArrayOutputWithContext(context.Background())
}

func (i MwsPermissionAssignmentArray) ToMwsPermissionAssignmentArrayOutputWithContext(ctx context.Context) MwsPermissionAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsPermissionAssignmentArrayOutput)
}

// MwsPermissionAssignmentMapInput is an input type that accepts MwsPermissionAssignmentMap and MwsPermissionAssignmentMapOutput values.
// You can construct a concrete instance of `MwsPermissionAssignmentMapInput` via:
//
//	MwsPermissionAssignmentMap{ "key": MwsPermissionAssignmentArgs{...} }
type MwsPermissionAssignmentMapInput interface {
	pulumi.Input

	ToMwsPermissionAssignmentMapOutput() MwsPermissionAssignmentMapOutput
	ToMwsPermissionAssignmentMapOutputWithContext(context.Context) MwsPermissionAssignmentMapOutput
}

type MwsPermissionAssignmentMap map[string]MwsPermissionAssignmentInput

func (MwsPermissionAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsPermissionAssignment)(nil)).Elem()
}

func (i MwsPermissionAssignmentMap) ToMwsPermissionAssignmentMapOutput() MwsPermissionAssignmentMapOutput {
	return i.ToMwsPermissionAssignmentMapOutputWithContext(context.Background())
}

func (i MwsPermissionAssignmentMap) ToMwsPermissionAssignmentMapOutputWithContext(ctx context.Context) MwsPermissionAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsPermissionAssignmentMapOutput)
}

type MwsPermissionAssignmentOutput struct{ *pulumi.OutputState }

func (MwsPermissionAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsPermissionAssignment)(nil)).Elem()
}

func (o MwsPermissionAssignmentOutput) ToMwsPermissionAssignmentOutput() MwsPermissionAssignmentOutput {
	return o
}

func (o MwsPermissionAssignmentOutput) ToMwsPermissionAssignmentOutputWithContext(ctx context.Context) MwsPermissionAssignmentOutput {
	return o
}

func (o MwsPermissionAssignmentOutput) Permissions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MwsPermissionAssignment) pulumi.StringArrayOutput { return v.Permissions }).(pulumi.StringArrayOutput)
}

func (o MwsPermissionAssignmentOutput) PrincipalId() pulumi.IntOutput {
	return o.ApplyT(func(v *MwsPermissionAssignment) pulumi.IntOutput { return v.PrincipalId }).(pulumi.IntOutput)
}

func (o MwsPermissionAssignmentOutput) WorkspaceId() pulumi.IntOutput {
	return o.ApplyT(func(v *MwsPermissionAssignment) pulumi.IntOutput { return v.WorkspaceId }).(pulumi.IntOutput)
}

type MwsPermissionAssignmentArrayOutput struct{ *pulumi.OutputState }

func (MwsPermissionAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsPermissionAssignment)(nil)).Elem()
}

func (o MwsPermissionAssignmentArrayOutput) ToMwsPermissionAssignmentArrayOutput() MwsPermissionAssignmentArrayOutput {
	return o
}

func (o MwsPermissionAssignmentArrayOutput) ToMwsPermissionAssignmentArrayOutputWithContext(ctx context.Context) MwsPermissionAssignmentArrayOutput {
	return o
}

func (o MwsPermissionAssignmentArrayOutput) Index(i pulumi.IntInput) MwsPermissionAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MwsPermissionAssignment {
		return vs[0].([]*MwsPermissionAssignment)[vs[1].(int)]
	}).(MwsPermissionAssignmentOutput)
}

type MwsPermissionAssignmentMapOutput struct{ *pulumi.OutputState }

func (MwsPermissionAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsPermissionAssignment)(nil)).Elem()
}

func (o MwsPermissionAssignmentMapOutput) ToMwsPermissionAssignmentMapOutput() MwsPermissionAssignmentMapOutput {
	return o
}

func (o MwsPermissionAssignmentMapOutput) ToMwsPermissionAssignmentMapOutputWithContext(ctx context.Context) MwsPermissionAssignmentMapOutput {
	return o
}

func (o MwsPermissionAssignmentMapOutput) MapIndex(k pulumi.StringInput) MwsPermissionAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MwsPermissionAssignment {
		return vs[0].(map[string]*MwsPermissionAssignment)[vs[1].(string)]
	}).(MwsPermissionAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MwsPermissionAssignmentInput)(nil)).Elem(), &MwsPermissionAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsPermissionAssignmentArrayInput)(nil)).Elem(), MwsPermissionAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsPermissionAssignmentMapInput)(nil)).Elem(), MwsPermissionAssignmentMap{})
	pulumi.RegisterOutputType(MwsPermissionAssignmentOutput{})
	pulumi.RegisterOutputType(MwsPermissionAssignmentArrayOutput{})
	pulumi.RegisterOutputType(MwsPermissionAssignmentMapOutput{})
}
