import {AutoCrud} from "@vaadin/hilla-react-crud";
import {PersonService} from "Frontend/generated/endpoints";
import PersonModel from "Frontend/generated/com/hamdi/chatbot_rag_v1/entities/PersonModel";

export default function (){
    return(
        <AutoCrud service={PersonService} model={PersonModel}></AutoCrud>
    );
}