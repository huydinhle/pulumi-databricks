// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.GitCredentialArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.GitCredentialState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * The resource cluster can be imported using ID of Git credential that could be obtained via REST APIbash
 * 
 * ```sh
 *  $ pulumi import databricks:index/gitCredential:GitCredential this &lt;git-credential-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/gitCredential:GitCredential")
public class GitCredential extends com.pulumi.resources.CustomResource {
    /**
     * specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it&#39;s already configured, the apply operation will fail.
     * 
     */
    @Export(name="force", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return specify if settings need to be enforced - right now, Databricks allows only single Git credential, so if it&#39;s already configured, the apply operation will fail.
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
     * 
     */
    @Export(name="gitProvider", type=String.class, parameters={})
    private Output<String> gitProvider;

    /**
     * @return case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Git Credentials API documentation](https://docs.databricks.com/dev-tools/api/latest/gitcredentials.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
     * 
     */
    public Output<String> gitProvider() {
        return this.gitProvider;
    }
    /**
     * user name at Git provider.
     * 
     */
    @Export(name="gitUsername", type=String.class, parameters={})
    private Output<String> gitUsername;

    /**
     * @return user name at Git provider.
     * 
     */
    public Output<String> gitUsername() {
        return this.gitUsername;
    }
    @Export(name="personalAccessToken", type=String.class, parameters={})
    private Output<String> personalAccessToken;

    public Output<String> personalAccessToken() {
        return this.personalAccessToken;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GitCredential(String name) {
        this(name, GitCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GitCredential(String name, GitCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GitCredential(String name, GitCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/gitCredential:GitCredential", name, args == null ? GitCredentialArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GitCredential(String name, Output<String> id, @Nullable GitCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/gitCredential:GitCredential", name, state, makeResourceOptions(options, id));
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
    public static GitCredential get(String name, Output<String> id, @Nullable GitCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GitCredential(name, id, state, options);
    }
}