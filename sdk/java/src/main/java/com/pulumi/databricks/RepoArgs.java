// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepoArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepoArgs Empty = new RepoArgs();

    /**
     * name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn&#39;t specified, then the repository will stay at the previously checked out state.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn&#39;t specified, then the repository will stay at the previously checked out state.
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * Hash of the HEAD commit at time of the last executed operation. It won&#39;t change if you manually perform pull operation via UI or API
     * 
     */
    @Import(name="commitHash")
    private @Nullable Output<String> commitHash;

    /**
     * @return Hash of the HEAD commit at time of the last executed operation. It won&#39;t change if you manually perform pull operation via UI or API
     * 
     */
    public Optional<Output<String>> commitHash() {
        return Optional.ofNullable(this.commitHash);
    }

    /**
     * case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, , `awsCodeCommit`.
     * 
     */
    @Import(name="gitProvider")
    private @Nullable Output<String> gitProvider;

    /**
     * @return case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, , `awsCodeCommit`.
     * 
     */
    public Optional<Output<String>> gitProvider() {
        return Optional.ofNullable(this.gitProvider);
    }

    /**
     * path to put the checked out Repo. If not specified, then repo will be created in the user&#39;s repo directory (`/Repos/&lt;username&gt;/...`).  If the value changes, repo is re-created.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return path to put the checked out Repo. If not specified, then repo will be created in the user&#39;s repo directory (`/Repos/&lt;username&gt;/...`).  If the value changes, repo is re-created.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * name of the tag for initial checkout.  Conflicts with `branch`.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return name of the tag for initial checkout.  Conflicts with `branch`.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    /**
     * The URL of the Git Repository to clone from. If the value changes, repo is re-created.
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return The URL of the Git Repository to clone from. If the value changes, repo is re-created.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    private RepoArgs() {}

    private RepoArgs(RepoArgs $) {
        this.branch = $.branch;
        this.commitHash = $.commitHash;
        this.gitProvider = $.gitProvider;
        this.path = $.path;
        this.tag = $.tag;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepoArgs $;

        public Builder() {
            $ = new RepoArgs();
        }

        public Builder(RepoArgs defaults) {
            $ = new RepoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param branch name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn&#39;t specified, then the repository will stay at the previously checked out state.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn&#39;t specified, then the repository will stay at the previously checked out state.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param commitHash Hash of the HEAD commit at time of the last executed operation. It won&#39;t change if you manually perform pull operation via UI or API
         * 
         * @return builder
         * 
         */
        public Builder commitHash(@Nullable Output<String> commitHash) {
            $.commitHash = commitHash;
            return this;
        }

        /**
         * @param commitHash Hash of the HEAD commit at time of the last executed operation. It won&#39;t change if you manually perform pull operation via UI or API
         * 
         * @return builder
         * 
         */
        public Builder commitHash(String commitHash) {
            return commitHash(Output.of(commitHash));
        }

        /**
         * @param gitProvider case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, , `awsCodeCommit`.
         * 
         * @return builder
         * 
         */
        public Builder gitProvider(@Nullable Output<String> gitProvider) {
            $.gitProvider = gitProvider;
            return this;
        }

        /**
         * @param gitProvider case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, , `awsCodeCommit`.
         * 
         * @return builder
         * 
         */
        public Builder gitProvider(String gitProvider) {
            return gitProvider(Output.of(gitProvider));
        }

        /**
         * @param path path to put the checked out Repo. If not specified, then repo will be created in the user&#39;s repo directory (`/Repos/&lt;username&gt;/...`).  If the value changes, repo is re-created.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path path to put the checked out Repo. If not specified, then repo will be created in the user&#39;s repo directory (`/Repos/&lt;username&gt;/...`).  If the value changes, repo is re-created.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param tag name of the tag for initial checkout.  Conflicts with `branch`.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag name of the tag for initial checkout.  Conflicts with `branch`.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        /**
         * @param url The URL of the Git Repository to clone from. If the value changes, repo is re-created.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the Git Repository to clone from. If the value changes, repo is re-created.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public RepoArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
