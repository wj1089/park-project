
<template>
    <div>
    <template>
        <v-card class="mx-auto overflow-hidden" :aspect-ratio="16/9" height="1000">
            <v-app-bar
                    color="black"
                    dense
                    dark
            >
                <template v-slot:img="{ props }">
                    <v-img
                            v-bind="props"
                            gradient="to top right, rgba(19,84,122,.5), rgba(128,208,199,.8)"
                    ></v-img>
                </template>
                <v-app-bar-nav-icon @click="drawer = true"></v-app-bar-nav-icon>
                <v-toolbar-title>

                </v-toolbar-title>

                <v-spacer>Park GYM</v-spacer>

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
            <v-sheet
                    id="scrolling-techniques-2"
                    class="overflow-y-auto"
                    max-height="800"
            >
                <div>
                    <div id="wrapper" >
                        <header id="sports">
                            <div id="title" >

                                <h1>My Best Bodycare System</h1>

                                <p>Create, Passion, Technology!</p>
                            </div>
                        </header>

                        <section id="content1" border="1">
                            <div name = contant1>

                            </div>
                        </section>

                        <section id="content2">
                            <div name="content2">
                                <img src="https://lh3.googleusercontent.com/proxy/cOyKtKtCLvSiVstV9oFrXZJCcEVzt_-LaTRyK5rF_hZw31Rm8VmCBGLKUcCPRODIUWlQNI4PPdhSDRiSD266-I-zFf8tRyP5WGXmftvfsi8hfWTvRtSRCw" width="550px">
                                <img src="https://citybook.pk/wp-content/uploads/2019/01/gym-in-lahore-dha-citybook-1.jpg" width="550px">
                            </div>
                        </section>

                        <footer>
                            <slot name="footer" :footer="footer"></slot>

                                <div class="text-center">
                                    <v-pagination
                                            v-model="page"
                                            :length="4"
                                            circle
                                    ></v-pagination>
                                </div>

                        </footer>

                    </div>
                </div>
                <v-container style="height: 1000px;"></v-container>
            </v-sheet>
        </v-card>
    </template>
    </div>
</template>

<script>
    export default {
        name: "Layout",
        data(){
            return {
                login : '로그인',
                join  : '회원가입',
                footer : '대한피트니스협회'
            }
        },
        methods: {
        }
    }
</script>


<style scoped>
    #wrapper {
        padding: 5px;
        width: 1500px;
        margin: 20px auto;
    }
    header {
        height: 150px;
        padding: 0 15px;
    }
    #content1 {
        width: 150px;
        float: left;
        padding: 5px 50px;
        min-height: 150px;
    }
    #content2 {
        width: 1490px;
        float: left;
        padding: 5px 120px;
        min-height: 550px;
    }
    footer {
        clear: both;
        padding: 0 15px;
    }
    @media screen and (max-width: 980px) {

        header, footer {
            padding: 1% 4%;
        }
    }


    header, #content, #middle, #sidebar {
        margin-bottom: 5px;
    }


    #sports {
        background-color: gray;
    }
</style>