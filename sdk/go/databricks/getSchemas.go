// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// Listing all schemas in a _sandbox_ databricks_catalog:
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
// 		sandbox, err := databricks.GetSchemas(ctx, &GetSchemasArgs{
// 			CatalogName: "sandbox",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("allSandboxSchemas", sandbox)
// 		return nil
// 	})
// }
// ```
// ## Related Resources
//
// The following resources are used in the same context:
//
// * Table to manage tables within Unity Catalog.
// * Schema to manage schemas within Unity Catalog.
// * Catalog to manage catalogs within Unity Catalog.
func GetSchemas(ctx *pulumi.Context, args *GetSchemasArgs, opts ...pulumi.InvokeOption) (*GetSchemasResult, error) {
	var rv GetSchemasResult
	err := ctx.Invoke("databricks:index/getSchemas:getSchemas", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchemas.
type GetSchemasArgs struct {
	// Name of databricks_catalog
	CatalogName string `pulumi:"catalogName"`
	// set of Schema full names: *`catalog`.`schema`*
	Ids []string `pulumi:"ids"`
}

// A collection of values returned by getSchemas.
type GetSchemasResult struct {
	CatalogName string `pulumi:"catalogName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// set of Schema full names: *`catalog`.`schema`*
	Ids []string `pulumi:"ids"`
}

func GetSchemasOutput(ctx *pulumi.Context, args GetSchemasOutputArgs, opts ...pulumi.InvokeOption) GetSchemasResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSchemasResult, error) {
			args := v.(GetSchemasArgs)
			r, err := GetSchemas(ctx, &args, opts...)
			var s GetSchemasResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSchemasResultOutput)
}

// A collection of arguments for invoking getSchemas.
type GetSchemasOutputArgs struct {
	// Name of databricks_catalog
	CatalogName pulumi.StringInput `pulumi:"catalogName"`
	// set of Schema full names: *`catalog`.`schema`*
	Ids pulumi.StringArrayInput `pulumi:"ids"`
}

func (GetSchemasOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchemasArgs)(nil)).Elem()
}

// A collection of values returned by getSchemas.
type GetSchemasResultOutput struct{ *pulumi.OutputState }

func (GetSchemasResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchemasResult)(nil)).Elem()
}

func (o GetSchemasResultOutput) ToGetSchemasResultOutput() GetSchemasResultOutput {
	return o
}

func (o GetSchemasResultOutput) ToGetSchemasResultOutputWithContext(ctx context.Context) GetSchemasResultOutput {
	return o
}

func (o GetSchemasResultOutput) CatalogName() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemasResult) string { return v.CatalogName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSchemasResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemasResult) string { return v.Id }).(pulumi.StringOutput)
}

// set of Schema full names: *`catalog`.`schema`*
func (o GetSchemasResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSchemasResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSchemasResultOutput{})
}
