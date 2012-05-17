package com.github.chrisprice.phonegapbuild.api.data.apps;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.github.chrisprice.phonegapbuild.api.data.AbstractResource;
import com.github.chrisprice.phonegapbuild.api.data.ResourcePath;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppPlatformKeyResponse extends AbstractResource<ResourcePath> {

  @Override
  protected ResourcePath createResourcePath(String link) {
    return null;
  }
}