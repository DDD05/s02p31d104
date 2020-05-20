<template>
  <v-content>
    <v-container>
      <form>
        <br />
        <v-text-field v-model="title" label="제목" required></v-text-field>
        <br />
        <v-textarea solo counter v-model="content" label="자유롭게 기록하세요!"></v-textarea>
        <v-row>
          <v-col cols="12">
            <v-combobox v-model="select" label="태그" multiple chips></v-combobox>
          </v-col>
        </v-row>
        <v-btn @click="clear()">clear</v-btn> &nbsp;&nbsp;
        <v-btn @click="submit()">submit</v-btn>
      </form>
    </v-container>
  </v-content>
</template>

<script>
export default {
  data: () => ({
    title: "",
    content: "",
    // select: ["a", "b", "c"]
    select: "",
  }),

  methods: {
    submit() {
      console.log("글쓰기!!");
      alert("글쓰기!!");
    },
    clear() {
      this.content = "";
    },
  },
};
</script>
