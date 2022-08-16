// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetastoreDataAccessAwsIamRole {
    /**
     * @return The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access, of the form `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF`
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private MetastoreDataAccessAwsIamRole(@CustomType.Parameter("roleArn") String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the AWS IAM role for S3 data access, of the form `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF`
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreDataAccessAwsIamRole defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreDataAccessAwsIamRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public MetastoreDataAccessAwsIamRole build() {
            return new MetastoreDataAccessAwsIamRole(roleArn);
        }
    }
}
