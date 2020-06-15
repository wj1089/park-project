<template>

    <v-app>
        <v-content>
            <GymHome/>
        </v-content>
    </v-app>


</template>

<script>
    import GymHome from "./components/common/GymHome";
    export default {
        components: {GymHome},
        data: () => ({
            //
        }),
    };
</script>