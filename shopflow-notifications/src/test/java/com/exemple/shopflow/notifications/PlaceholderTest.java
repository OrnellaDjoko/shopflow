package com.exemple.shopflow.notifications;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PlaceholderTest {

  @Test
  void nom_retourneLeNomDuModule() {
    assertThat(Placeholder.nom()).isEqualTo("shopflow-notifications");
  }
}
