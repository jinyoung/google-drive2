<template>

    <v-card outlined>
        <v-card-title>
            DisplayFileStatus
        </v-card-title>

        <v-card-text>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
            <Number label="Size" v-model="value.size" :editMode="editMode"/>
            <String label="UploadStatus" v-model="value.uploadStatus" :editMode="editMode"/>
            <String label="IndexingStatus" v-model="value.indexingStatus" :editMode="editMode"/>
            <String label="VideoUrl" v-model="value.videoUrl" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="displayFileStatus"
            >
                DisplayFileStatus
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'DisplayFileStatusCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.name = '';
            this.value.size = 0;
            this.value.uploadStatus = '';
            this.value.indexingStatus = '';
            this.value.videoUrl = '';
        },
        watch: {
        },
        methods: {
            displayFileStatus() {
                this.$emit('displayFileStatus', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

