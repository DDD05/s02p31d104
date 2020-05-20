<template>
  <v-navigation-drawer
    :color="themeColor"
    v-model="$store.state.ui.drawer"
    app
    clipped
  >
  </v-navigation-drawer>
</template>

<script>
export default {
  computed: {
    themeColor() {
      return this.$store.getters.getThemeColor;
    },
  },
};
</script>

<style></style>
