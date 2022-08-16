// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.SecretAclArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.SecretAclState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Create or overwrite the ACL associated with the given principal (user or group) on the specified databricks_secret_scope. Please consult [Secrets User Guide](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) for more details.
 * 
 * ## Example Usage
 * 
 * This way, data scientists can read the Publishing API key that is synchronized from example, Azure Key Vault.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Group;
 * import com.pulumi.databricks.GroupArgs;
 * import com.pulumi.databricks.SecretScope;
 * import com.pulumi.databricks.SecretAcl;
 * import com.pulumi.databricks.SecretAclArgs;
 * import com.pulumi.databricks.Secret;
 * import com.pulumi.databricks.SecretArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var ds = new Group(&#34;ds&#34;, GroupArgs.builder()        
 *             .displayName(&#34;data-scientists&#34;)
 *             .build());
 * 
 *         var app = new SecretScope(&#34;app&#34;);
 * 
 *         var mySecretAcl = new SecretAcl(&#34;mySecretAcl&#34;, SecretAclArgs.builder()        
 *             .principal(ds.displayName())
 *             .permission(&#34;READ&#34;)
 *             .scope(app.name())
 *             .build());
 * 
 *         var publishingApi = new Secret(&#34;publishingApi&#34;, SecretArgs.builder()        
 *             .key(&#34;publishing_api&#34;)
 *             .stringValue(data.azurerm_key_vault_secret().example().value())
 *             .scope(app.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
 * * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
 * * databricks.Secret to manage [secrets](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.
 * * databricks.SecretScope to create [secret scopes](https://docs.databricks.com/security/secrets/index.html#secrets-user-guide) in Databricks workspace.
 * 
 * ## Import
 * 
 * The resource secret acl can be imported using `scopeName|||principalName` combination. bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/secretAcl:SecretAcl object `scopeName|||principalName`
 * ```
 * 
 */
@ResourceType(type="databricks:index/secretAcl:SecretAcl")
public class SecretAcl extends com.pulumi.resources.CustomResource {
    /**
     * `READ`, `WRITE` or `MANAGE`.
     * 
     */
    @Export(name="permission", type=String.class, parameters={})
    private Output<String> permission;

    /**
     * @return `READ`, `WRITE` or `MANAGE`.
     * 
     */
    public Output<String> permission() {
        return this.permission;
    }
    /**
     * name of the principals. It can be `users` for all users or name or `display_name` of databricks_group
     * 
     */
    @Export(name="principal", type=String.class, parameters={})
    private Output<String> principal;

    /**
     * @return name of the principals. It can be `users` for all users or name or `display_name` of databricks_group
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }
    /**
     * name of the scope
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return name of the scope
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretAcl(String name) {
        this(name, SecretAclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretAcl(String name, SecretAclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretAcl(String name, SecretAclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/secretAcl:SecretAcl", name, args == null ? SecretAclArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecretAcl(String name, Output<String> id, @Nullable SecretAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/secretAcl:SecretAcl", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SecretAcl get(String name, Output<String> id, @Nullable SecretAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecretAcl(name, id, state, options);
    }
}
