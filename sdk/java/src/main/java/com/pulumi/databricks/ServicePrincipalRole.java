// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.ServicePrincipalRoleArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.ServicePrincipalRoleState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource allows you to attach a role or databricks.InstanceProfile (AWS) to a databricks_service_principal.
 * 
 * ## Example Usage
 * 
 * Granting a service principal access to an instance profile
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.InstanceProfile;
 * import com.pulumi.databricks.InstanceProfileArgs;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
 * import com.pulumi.databricks.ServicePrincipalRole;
 * import com.pulumi.databricks.ServicePrincipalRoleArgs;
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
 *         var instanceProfile = new InstanceProfile(&#34;instanceProfile&#34;, InstanceProfileArgs.builder()        
 *             .instanceProfileArn(&#34;my_instance_profile_arn&#34;)
 *             .build());
 * 
 *         var this_ = new ServicePrincipal(&#34;this&#34;, ServicePrincipalArgs.builder()        
 *             .displayName(&#34;My Service Principal&#34;)
 *             .build());
 * 
 *         var myServicePrincipalInstanceProfile = new ServicePrincipalRole(&#34;myServicePrincipalInstanceProfile&#34;, ServicePrincipalRoleArgs.builder()        
 *             .servicePrincipalId(this_.id())
 *             .role(instanceProfile.id())
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
 * * databricks.UserRole to attach role or databricks.InstanceProfile (AWS) to databricks_user.
 * * databricks.GroupInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_group.
 * * databricks_group_member to attach users and groups as group members.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/servicePrincipalRole:ServicePrincipalRole")
public class ServicePrincipalRole extends com.pulumi.resources.CustomResource {
    /**
     * This is the id of the role or instance profile resource.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return This is the id of the role or instance profile resource.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * This is the id of the service principal resource.
     * 
     */
    @Export(name="servicePrincipalId", type=String.class, parameters={})
    private Output<String> servicePrincipalId;

    /**
     * @return This is the id of the service principal resource.
     * 
     */
    public Output<String> servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServicePrincipalRole(String name) {
        this(name, ServicePrincipalRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServicePrincipalRole(String name, ServicePrincipalRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServicePrincipalRole(String name, ServicePrincipalRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/servicePrincipalRole:ServicePrincipalRole", name, args == null ? ServicePrincipalRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServicePrincipalRole(String name, Output<String> id, @Nullable ServicePrincipalRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/servicePrincipalRole:ServicePrincipalRole", name, state, makeResourceOptions(options, id));
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
    public static ServicePrincipalRole get(String name, Output<String> id, @Nullable ServicePrincipalRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServicePrincipalRole(name, id, state, options);
    }
}
