Реализовать, с учетом ооп подхода, приложение для проведения исследований с генеалогическим древом.

Программа позволяет осуществлять следующие операции:
1) Описание человека - Person (имя, возраст, пол (Male\Female))
2) Создание генеалогического древа - GeoTree();
3) Добавление в древо связей между людьми - древо.append(человек1, отношение1, человек2, отношение2)
    В древо записываются отношения ребенок/родитель и муж/жена, например: Relationship.parent
4) Вывод информации о членах семьи (System.out.println(irina))
5) Поиск по древу, человеку и отношению, в котором этот человек состоит с другими членами семьи 
        (например: print(tree, vasya, Relationship.husband) - выведет всех людей, по отношению к которым Вася является мужем). 
    
    Поиск осуществляется по таким отношениям как родитель/ребенок, муж/жена, дедушка (бабушка)/внук (внучка)
    
    Так как в древе отдельно не содержатся отношения бабушек и внуков, при вводе отношения для поиска используется разный синтаксис:
        
        для муж/жена и родитель/ребенок -   Relationship.parent, Relationship.wife и т.п.
        
        для дедушки / внука -               SearchRe.grandParent, SearchRe.grandСhildren
6) Поиск по полу - выводит всех людей выбранного пола. Например: print(gt, Gender.Male)/ print(gt, Gender.Female)
7) Поиск по возрасту - выводит всех людей от (SearchAge.ageOlder) или до (SearchAge.ageYounger) выбранного возраста. 
    Например: print(gt, SearchAge.ageOlder, 40)