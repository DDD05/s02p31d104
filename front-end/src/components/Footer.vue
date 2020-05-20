<template>
  <v-footer :color="themeColor" app class="lighten-1 white--text text-center">
    <v-card-text>
      <v-btn
        v-for="(icon, idx) in icons"
        :key="icon"
        class="mx-4 white--text"
        icon
        @click="iconLink(idx)"
      >
        <v-icon size="24px">{{ icon }}</v-icon>
      </v-btn>
    </v-card-text>
  </v-footer>
</template>

<script>
export default {
  data() {
    return {
      icons: [
        "mdi-gitlab",
        "mdi-text-box-search-outline",
        "mdi-instagram",
        "mdi-jira",
      ],
    };
  },
  methods: {
    iconLink(idx) {
      if (idx == 0)
        window.location.href = "https://lab.ssafy.com/s02-final/s02p31d104.git";
      else if (idx == 1)
        window.location.href =
          "https://www.notion.so/donaldd/467725f1022f43659dad3469087553b2";
      else if (idx == 2)
        window.location.href = "https://www.instagram.com/2seong.ddd/";
      else if (idx == 3)
        window.location.href =
          "https://jira.ssafy.com/secure/RapidBoard.jspa?rapidView=3030&view=planning.nodetail&issueLimit=100";
    },
  },
  computed: {
    themeColor() {
      return this.$store.getters.getThemeColor;
    },
  },
};
</script>

<style></style>
