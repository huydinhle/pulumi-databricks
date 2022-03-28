// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Private Preview** This feature is in [Private Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.
//
// Within a metastore, Unity Catalog provides a 3-level namespace for organizing data: Catalogs, Databases (also called Schemas), and Tables / Views.
//
// A `Schema` is contained within Catalog and can contain tables & views.
//
// ## Example Usage
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
// 		sandbox, err := databricks.NewCatalog(ctx, "sandbox", &databricks.CatalogArgs{
// 			MetastoreId: pulumi.Any(databricks_metastore.This.Id),
// 			Comment:     pulumi.String("this catalog is managed by terraform"),
// 			Properties: pulumi.AnyMap{
// 				"purpose": pulumi.Any("testing"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = databricks.NewSchema(ctx, "things", &databricks.SchemaArgs{
// 			CatalogName: sandbox.ID(),
// 			Comment:     pulumi.String("this database is managed by terraform"),
// 			Properties: pulumi.AnyMap{
// 				"kind": pulumi.Any("various"),
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
// The following resources are used in the same context:
//
// * Table data to list tables within Unity Catalog.
// * Schema data to list schemas within Unity Catalog.
// * Catalog data to list catalogs within Unity Catalog.
//
// ## Import
//
// This resource can be imported by namebash
//
// ```sh
//  $ pulumi import databricks:index/schema:Schema this <name>
// ```
type Schema struct {
	pulumi.CustomResourceState

	// Name of parent catalog
	CatalogName pulumi.StringOutput `pulumi:"catalogName"`
	// User-supplied free-form text.
	Comment     pulumi.StringPtrOutput `pulumi:"comment"`
	MetastoreId pulumi.StringOutput    `pulumi:"metastoreId"`
	// Name of Schema relative to parent catalog. Change forces creation of a new resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Username/groupname of schema owner. Currently this field can only be changed after the resource is created.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// Extensible Schema properties.
	Properties pulumi.MapOutput `pulumi:"properties"`
}

// NewSchema registers a new resource with the given unique name, arguments, and options.
func NewSchema(ctx *pulumi.Context,
	name string, args *SchemaArgs, opts ...pulumi.ResourceOption) (*Schema, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CatalogName == nil {
		return nil, errors.New("invalid value for required argument 'CatalogName'")
	}
	var resource Schema
	err := ctx.RegisterResource("databricks:index/schema:Schema", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchema gets an existing Schema resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchema(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchemaState, opts ...pulumi.ResourceOption) (*Schema, error) {
	var resource Schema
	err := ctx.ReadResource("databricks:index/schema:Schema", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Schema resources.
type schemaState struct {
	// Name of parent catalog
	CatalogName *string `pulumi:"catalogName"`
	// User-supplied free-form text.
	Comment     *string `pulumi:"comment"`
	MetastoreId *string `pulumi:"metastoreId"`
	// Name of Schema relative to parent catalog. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname of schema owner. Currently this field can only be changed after the resource is created.
	Owner *string `pulumi:"owner"`
	// Extensible Schema properties.
	Properties map[string]interface{} `pulumi:"properties"`
}

type SchemaState struct {
	// Name of parent catalog
	CatalogName pulumi.StringPtrInput
	// User-supplied free-form text.
	Comment     pulumi.StringPtrInput
	MetastoreId pulumi.StringPtrInput
	// Name of Schema relative to parent catalog. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname of schema owner. Currently this field can only be changed after the resource is created.
	Owner pulumi.StringPtrInput
	// Extensible Schema properties.
	Properties pulumi.MapInput
}

func (SchemaState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaState)(nil)).Elem()
}

type schemaArgs struct {
	// Name of parent catalog
	CatalogName string `pulumi:"catalogName"`
	// User-supplied free-form text.
	Comment     *string `pulumi:"comment"`
	MetastoreId *string `pulumi:"metastoreId"`
	// Name of Schema relative to parent catalog. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname of schema owner. Currently this field can only be changed after the resource is created.
	Owner *string `pulumi:"owner"`
	// Extensible Schema properties.
	Properties map[string]interface{} `pulumi:"properties"`
}

// The set of arguments for constructing a Schema resource.
type SchemaArgs struct {
	// Name of parent catalog
	CatalogName pulumi.StringInput
	// User-supplied free-form text.
	Comment     pulumi.StringPtrInput
	MetastoreId pulumi.StringPtrInput
	// Name of Schema relative to parent catalog. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname of schema owner. Currently this field can only be changed after the resource is created.
	Owner pulumi.StringPtrInput
	// Extensible Schema properties.
	Properties pulumi.MapInput
}

func (SchemaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaArgs)(nil)).Elem()
}

type SchemaInput interface {
	pulumi.Input

	ToSchemaOutput() SchemaOutput
	ToSchemaOutputWithContext(ctx context.Context) SchemaOutput
}

func (*Schema) ElementType() reflect.Type {
	return reflect.TypeOf((**Schema)(nil)).Elem()
}

func (i *Schema) ToSchemaOutput() SchemaOutput {
	return i.ToSchemaOutputWithContext(context.Background())
}

func (i *Schema) ToSchemaOutputWithContext(ctx context.Context) SchemaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaOutput)
}

// SchemaArrayInput is an input type that accepts SchemaArray and SchemaArrayOutput values.
// You can construct a concrete instance of `SchemaArrayInput` via:
//
//          SchemaArray{ SchemaArgs{...} }
type SchemaArrayInput interface {
	pulumi.Input

	ToSchemaArrayOutput() SchemaArrayOutput
	ToSchemaArrayOutputWithContext(context.Context) SchemaArrayOutput
}

type SchemaArray []SchemaInput

func (SchemaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Schema)(nil)).Elem()
}

func (i SchemaArray) ToSchemaArrayOutput() SchemaArrayOutput {
	return i.ToSchemaArrayOutputWithContext(context.Background())
}

func (i SchemaArray) ToSchemaArrayOutputWithContext(ctx context.Context) SchemaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaArrayOutput)
}

// SchemaMapInput is an input type that accepts SchemaMap and SchemaMapOutput values.
// You can construct a concrete instance of `SchemaMapInput` via:
//
//          SchemaMap{ "key": SchemaArgs{...} }
type SchemaMapInput interface {
	pulumi.Input

	ToSchemaMapOutput() SchemaMapOutput
	ToSchemaMapOutputWithContext(context.Context) SchemaMapOutput
}

type SchemaMap map[string]SchemaInput

func (SchemaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Schema)(nil)).Elem()
}

func (i SchemaMap) ToSchemaMapOutput() SchemaMapOutput {
	return i.ToSchemaMapOutputWithContext(context.Background())
}

func (i SchemaMap) ToSchemaMapOutputWithContext(ctx context.Context) SchemaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaMapOutput)
}

type SchemaOutput struct{ *pulumi.OutputState }

func (SchemaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Schema)(nil)).Elem()
}

func (o SchemaOutput) ToSchemaOutput() SchemaOutput {
	return o
}

func (o SchemaOutput) ToSchemaOutputWithContext(ctx context.Context) SchemaOutput {
	return o
}

type SchemaArrayOutput struct{ *pulumi.OutputState }

func (SchemaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Schema)(nil)).Elem()
}

func (o SchemaArrayOutput) ToSchemaArrayOutput() SchemaArrayOutput {
	return o
}

func (o SchemaArrayOutput) ToSchemaArrayOutputWithContext(ctx context.Context) SchemaArrayOutput {
	return o
}

func (o SchemaArrayOutput) Index(i pulumi.IntInput) SchemaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Schema {
		return vs[0].([]*Schema)[vs[1].(int)]
	}).(SchemaOutput)
}

type SchemaMapOutput struct{ *pulumi.OutputState }

func (SchemaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Schema)(nil)).Elem()
}

func (o SchemaMapOutput) ToSchemaMapOutput() SchemaMapOutput {
	return o
}

func (o SchemaMapOutput) ToSchemaMapOutputWithContext(ctx context.Context) SchemaMapOutput {
	return o
}

func (o SchemaMapOutput) MapIndex(k pulumi.StringInput) SchemaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Schema {
		return vs[0].(map[string]*Schema)[vs[1].(string)]
	}).(SchemaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaInput)(nil)).Elem(), &Schema{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaArrayInput)(nil)).Elem(), SchemaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaMapInput)(nil)).Elem(), SchemaMap{})
	pulumi.RegisterOutputType(SchemaOutput{})
	pulumi.RegisterOutputType(SchemaArrayOutput{})
	pulumi.RegisterOutputType(SchemaMapOutput{})
}