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
// Listing all catalogs:
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
// 		all, err := databricks.GetCatalogs(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("allCatalogs", all)
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
func GetCatalogs(ctx *pulumi.Context, args *GetCatalogsArgs, opts ...pulumi.InvokeOption) (*GetCatalogsResult, error) {
	var rv GetCatalogsResult
	err := ctx.Invoke("databricks:index/getCatalogs:getCatalogs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCatalogs.
type GetCatalogsArgs struct {
	// set of Catalog names
	Ids []string `pulumi:"ids"`
}

// A collection of values returned by getCatalogs.
type GetCatalogsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// set of Catalog names
	Ids []string `pulumi:"ids"`
}

func GetCatalogsOutput(ctx *pulumi.Context, args GetCatalogsOutputArgs, opts ...pulumi.InvokeOption) GetCatalogsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCatalogsResult, error) {
			args := v.(GetCatalogsArgs)
			r, err := GetCatalogs(ctx, &args, opts...)
			var s GetCatalogsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCatalogsResultOutput)
}

// A collection of arguments for invoking getCatalogs.
type GetCatalogsOutputArgs struct {
	// set of Catalog names
	Ids pulumi.StringArrayInput `pulumi:"ids"`
}

func (GetCatalogsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCatalogsArgs)(nil)).Elem()
}

// A collection of values returned by getCatalogs.
type GetCatalogsResultOutput struct{ *pulumi.OutputState }

func (GetCatalogsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCatalogsResult)(nil)).Elem()
}

func (o GetCatalogsResultOutput) ToGetCatalogsResultOutput() GetCatalogsResultOutput {
	return o
}

func (o GetCatalogsResultOutput) ToGetCatalogsResultOutputWithContext(ctx context.Context) GetCatalogsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetCatalogsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCatalogsResult) string { return v.Id }).(pulumi.StringOutput)
}

// set of Catalog names
func (o GetCatalogsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetCatalogsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCatalogsResultOutput{})
}
