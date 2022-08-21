 import { Component, OnInit } from "@angular/core"; // vai fazer com que minha classe seja elegível para ser um componente
import { Course } from "./course";


@Component ({
    selector: 'app-course-list',
    templateUrl: './course-list.component.html'
})
export class courseListComponent implements OnInit{

    courses: Course[] = [];

    ngOnInit():void{
        this.courses = [
            {            
                id!: 1,
                name!: 'Angular: Forms',
                imageUrl!: string;
                preco!: number;
                code!: string;
                duration!: number;
                rating!: number;
            }
        ]
    }

}