<template>
    <div>
        <v-app-bar
            app
            color="black"
            dark
    >
        <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
        <v-toolbar-title>Park. GYM</v-toolbar-title>
        <v-btn icon>
            <v-icon>mdi-magnify</v-icon>
        </v-btn>

        <v-btn icon>
            <v-icon>mdi-heart</v-icon>
        </v-btn>

        <v-btn icon>
            <v-icon>mdi-dots-vertical</v-icon>
        </v-btn>

    </v-app-bar>


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
                        <v-list-item-title @click="log">Login</v-list-item-title>
                    </v-list-item-content>
                </v-list-item>


                <v-list-item Place>
                    <v-list-item-action>
                        <v-icon>fas fa-list</v-icon>
                    </v-list-item-action>
                    <v-list-item-content >
                        <v-list-item-title @click="place">Place</v-list-item-title>
                    </v-list-item-content>
                </v-list-item>

            </v-list>
        </v-navigation-drawer>

        <div>
            <input id="search"
                   v-model="searchWord"
                   type="text"
                   style=" background-repeat: no-repeat; background-position: 88% 150%, 120% 50%;"
                   title="검색">
        </div>
        <div id="box">
            <input  @click="search" id="google_search" type="button" value="Google 검색">
        </div>

        <div id="app">
            <v-app id="inspire">
                <v-simple-table>
                    <template v-slot:default>
                        <thead>
                        <tr>
                            <th class="text-left">순번</th>
                            <th class="text-left">영업장이름</th>
                            <th class="text-left">우편번호</th>
                            <th class="text-left">상세주소</th>
                            <th class="text-left">영업코드</th>
                            <th class="text-left">영업현황</th>
                            <th class="text-left">전화번호</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr v-for="item of gym" :key="item.gym_no">
                            <td>{{item.ser_num}}</td>
                            <td>{{item.open_yn}}</td>
                            <td>{{item.number}}</td>
                            <td>{{item.address}}</td>
                            <td>{{item.mailing_address}}</td>
                            <td>{{item.name}}</td>
                        </tr>
                        </tbody>
                    </template>
                </v-simple-table>
            </v-app>
        </div>
    </div>
</template>

<script>
    import { mapState } from "vuex";
    export default {
        data () {
            return {
                search: '',
                method:{

                },

        }
    },
        computed: {
            ...mapState({
                gym: state => state.gym.gym
            })
        },
        transferPage(){
            this.$store.dispatch('gym/search',{cate:'gyms',searchWord:'null'})
        }
    }
</script>

<style scoped>

</style>