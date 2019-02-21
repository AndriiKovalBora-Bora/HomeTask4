package com.company.controller;

import com.company.model.LoginException;
import com.company.model.Model;
import com.company.view.View;

import java.util.Scanner;

import static com.company.controller.RegexContainer.REGEX_NAME_LAT;
import static com.company.controller.RegexContainer.REGEX_NAME_UKR;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
            Scanner sc = new Scanner(System.in);
            InputNoteNoteBook inputNoteNoteBook =
                    new InputNoteNoteBook(view, sc);

            boolean b = false;
            do {
                try {
                    System.out.println("1");
                    inputNoteNoteBook.inputNote();
                    model.check(inputNoteNoteBook.getFirstName(), inputNoteNoteBook.getLogin());
                    b = true;
                }catch (LoginException e){
                    view.printMessage("Login : " + e.getLogin() + " already exist, please enter again");
                }
            } while (!b);
            view.printMessage("Ok");
            model.setName(inputNoteNoteBook.getFirstName());
            model.setLogin(inputNoteNoteBook.getLogin());

        }
    }


