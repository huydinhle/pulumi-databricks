// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobGitSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// name of the Git branch to use. Conflicts with `tag` and `commit`.
        /// </summary>
        [Input("branch")]
        public Input<string>? Branch { get; set; }

        /// <summary>
        /// hash of Git commit to use. Conflicts with `branch` and `tag`.
        /// </summary>
        [Input("commit")]
        public Input<string>? Commit { get; set; }

        /// <summary>
        /// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`.
        /// </summary>
        [Input("provider")]
        public Input<string>? Provider { get; set; }

        /// <summary>
        /// name of the Git branch to use. Conflicts with `branch` and `commit`.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        /// <summary>
        /// URL of the job on the given workspace
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public JobGitSourceArgs()
        {
        }
        public static new JobGitSourceArgs Empty => new JobGitSourceArgs();
    }
}
