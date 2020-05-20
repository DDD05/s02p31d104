<template>
  <div>
    <v-row justify="center">
      <v-dialog v-model="showDialog" persistent max-width="1100">
        <login @loginEvent="loginEvent" />
        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn @click="loginEvent('Force')">강제 로그인</v-btn>
        </v-card-actions>
      </v-dialog>
    </v-row>
    <router-view name="sidebar" />
    <router-view />
  </div>
</template>

<script>
import login from "@/components/Login.vue";
export default {
  data() {
    return {};
  },
  methods: {
    loginEvent(payload) {
      console.log(`${payload} Login Event`);
      this.$store.commit("login");
    },
  },
  computed: {
    showDialog() {
      return !this.$store.getters.userAuth;
    },
  },
  components: {
    login,
  },
};
</script>

<style></style>
