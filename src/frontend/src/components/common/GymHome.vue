<template>

<!--  <div id="app">-->
<!--    <v-app id="inspire">-->
<!--      <v-card flat>-->
<!--        <v-toolbar-->
<!--                color="primary"-->
<!--                dark-->
<!--                extended-->
<!--                flat-->
<!--        >-->
<!--          <v-app-bar-nav-icon></v-app-bar-nav-icon>-->
<!--        </v-toolbar>-->

<!--        <v-card-->
<!--                class="mx-auto"-->
<!--                max-width="700"-->
<!--                style="margin-top: -64px;"-->
<!--        >-->
<!--          <v-toolbar flat>-->
<!--            <v-toolbar-title class="grey&#45;&#45;text">Title</v-toolbar-title>-->

<!--            <v-spacer></v-spacer>-->

<!--            <v-btn icon>-->
<!--              <v-icon>mdi-magnify</v-icon>-->
<!--            </v-btn>-->

<!--            <v-btn icon>-->
<!--              <v-icon>mdi-apps</v-icon>-->
<!--            </v-btn>-->

<!--            <v-btn icon>-->
<!--              <v-icon>mdi-dots-vertical</v-icon>-->
<!--            </v-btn>-->
<!--          </v-toolbar>-->

<!--          <v-divider></v-divider>-->

<!--          <v-card-text style="height: 200px;"></v-card-text>-->
<!--        </v-card>-->
<!--      </v-card>-->
<!--    </v-app>-->
<!--  </div>-->

<!--&#45;&#45;&#45;&#45;&#45;&#45;&#45;&#45;&#45;&#45;&#45;&#45;&#45;&#45;-->
  <v-app id="inspire">

    <v-navigation-drawer
            v-model="drawer"
            app
    >
      <v-divider></v-divider>

      <v-list dense>
        <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-home</v-icon>
          </v-list-item-action>

          <v-list-item-content>
            <router-link to="/"><v-list-item-title>Home</v-list-item-title></router-link>
          </v-list-item-content>
        </v-list-item>

      <v-list-item link>
          <v-list-item-action>
            <v-icon>mdi-email</v-icon>
          </v-list-item-action>

          <v-list-item-content>
            <router-link to="/user/Login"><v-list-item-title>Login</v-list-item-title></router-link>
          </v-list-item-content>
      </v-list-item>


      <v-list-item Login id="img1">
        <v-list-item-action>
          <v-icon>fas fa-list</v-icon>
        </v-list-item-action>
        <v-list-item-content >
          <v-list-item-title >Login</v-list-item-title>
        </v-list-item-content>
      </v-list-item>

    </v-list>
  </v-navigation-drawer>

<!--  <v-app-bar-->
<!--          app-->
<!--          color="black"-->
<!--          dark-->
<!--  >-->

<!--      <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>-->
<!--      <v-toolbar-title>박우준님</v-toolbar-title>-->
<!--          <v-btn icon>-->
<!--            <v-icon>mdi-magnify</v-icon>-->
<!--          </v-btn>-->

<!--          <v-btn icon>-->
<!--            <v-icon>mdi-heart</v-icon>-->
<!--          </v-btn>-->

<!--      <v-btn icon>-->
<!--        <v-icon>mdi-dots-vertical</v-icon>-->
<!--      </v-btn>-->

<!--  </v-app-bar>-->
    <v-toolbar flat>
                  <v-toolbar-title class="grey--text">박우준님</v-toolbar-title>

                  <v-spacer></v-spacer>

                  <v-btn icon>
                    <v-icon>mdi-magnify</v-icon>
                  </v-btn>

                  <v-btn icon>
                    <v-icon>mdi-apps</v-icon>
                  </v-btn>

                  <v-btn icon>
                    <v-icon>mdi-dots-vertical</v-icon>
                  </v-btn>
                </v-toolbar>

    <v-container fluid>

  <v-content1>
    <template>
      <v-carousel>
        <v-carousel-item
                v-for="(item,i) in slides"
                :key="i"
                :src="item.src"
                reverse-transition="fade-transition"
                transition="fade-transition"
        ></v-carousel-item>
      </v-carousel>
    </template>
    <v-container
            class="fill-height"
            fluid
    >
    </v-container>
  </v-content1>

  <v-content2>
    <div id="story">
      <v-app id="inspire">
        <div>
          <v-card class="d-inline-block mx-auto">
            <v-container>
              <v-row justify="space-between">
                <v-col cols="auto">
                  <v-img
                          height="200"
                          width="200"
                          src="https://cdn.vuetifyjs.com/images/cards/store.jpg"
                  ></v-img>
                </v-col>

                <v-col
                        cols="auto"
                        class="text-center pl-0"
                >
                  <v-row
                          class="flex-column ma-0 fill-height"
                          justify="center"
                  >
                    <v-col class="px-0">
                      <v-btn icon>
                        <v-icon>mdi-heart</v-icon>
                      </v-btn>
                    </v-col>

                    <v-col class="px-0">
                      <v-btn icon>
                        <v-icon>mdi-bookmark</v-icon>
                      </v-btn>
                    </v-col>

                    <v-col class="px-0">
                      <v-btn icon>
                        <v-icon>mdi-share-variant</v-icon>
                      </v-btn>
                    </v-col>

                  </v-row>
                </v-col>
              </v-row>
            </v-container>
          </v-card>
        </div>
      </v-app>
    </div>
  </v-content2>
    </v-container>


  <template>
    <v-footer
            dark
            padless
    >
      <v-card
              class="flex"
              flat
              tile
      >
        <v-card-title class="teal">
          <strong class="subheading">Get connected with us on social networks!</strong>

          <v-spacer></v-spacer>

          <v-btn
                  v-for="icon in icons"
                  :key="icon"
                  class="mx-4"
                  black
                  icon
          >
            <v-icon size="24px">{{ icon }}</v-icon>
          </v-btn>
        </v-card-title>

        <v-card-text class="py-2 white--text text-center">
          {{ new Date().getFullYear() }} — <strong>Park.Gym</strong>
        </v-card-text>
      </v-card>

    </v-footer>
  </template>
</v-app>

</template>

<script>
  export default {
    name: 'GymHome',
    props: {
      source: String,
    },

    data: () => ({

      drawer: null,
      slides: [
        {
          src: 'https://images.unsplash.com/photo-1576678927484-cc907957088c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80',
        },
        {
          src : 'https://images.unsplash.com/photo-1507398941214-572c25f4b1dc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=966&q=80',
        },
        {
          src: 'https://images.unsplash.com/photo-1580051745101-2dca6e53f15c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80',
        },
        {
          src: 'https://images.unsplash.com/photo-1518622358385-8ea7d0794bf6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80',
        },
      ],
      icons: [
        'mdi-facebook',
        'mdi-twitter',
        'mdi-linkedin',
        'mdi-instagram',
      ],
    })
  }


</script>
<style scoped>
  #search {
    color: white;
  }

</style>