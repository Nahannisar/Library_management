package com.example.collegelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BooksFragment extends Fragment {

    private RecyclerView listBooks;
    private List<Books> booksList = new ArrayList<>();
    private Button btnAddBook;
    private BooksAdapter mAdapter;

    public BooksFragment() {
        // Required empty public constructor
    }

    /**
     * @return A new instance of fragment SpeedDialFragment.
     */
    public static StudentsFragment newInstance() {
        return new StudentsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_books, container, false);

        listBooks = (RecyclerView) root.findViewById(R.id.list_books);
        btnAddBook = (Button) root.findViewById(R.id.btn_add_book);
//        listBooks.setVisibility(View.INVISIBLE);
        listBooks.setLayoutManager(new LinearLayoutManager(getActivity()));

        btnAddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), NewBookActivity.class);
                startActivityForResult(intent, 12);
            }
        });

        // this is data fro recycler view
        Books books = new Books("Introduction to Algorithms (Eastern Economy Edition)2 February 2010",
                "Charles E. Leiserson and Ronald L. Rivest", "This internationally acclaimed textbook provides a comprehensive introduction to the modern study of\n" +
                "computer algorithms.",
                "This internationally acclaimed textbook provides a comprehensive introduction to the modern study of\n" +
                        "computer algorithms. It covers a broad range of algorithms in depth, yet makes their design and analysis\n" +
                        "accessible to all levels of readers. Each chapter is relatively selfcontained and presents an algorithm, a\n" +
                        "design technique, an application area, or a related topic. The algorithms are described and designed in a\n" +
                        "manner to be readable by anyone who has done a little programming. The explanations have been kept\n" +
                        "elementary without sacrificing depth of coverage or mathematical rigor.\n" +
                        "The third edition has been revised and updated throughout. It includes two completely new chapters, on\n" +
                        "Van Emde Boas trees and Multithreaded algorithms, and substantial additions to the chapter on\n" +
                        "recurrences (now called “Divide and Conquer”). It features improved treatment of dynamic programming\n" +
                        "and greedy algorithms and a new notion of edgebased flow in the material on flow networks. Many new\n" +
                        "exercises and problems have been added in this edition. The text is intended primarily for students\n" +
                        "studying algorithms or data structures. As it discusses engineering issues in algorithm design, as well as\n" +
                        "mathematical aspects, it is equally well suited for selfstudy by technical professionals.");
        booksList.add(books);

        Books books2 = new Books("Let Us C – 13 Jul 2016", "Yashavant Kanetkar", "For C language programmers, it is must to master the complexity of the language to deal with\n" +
                "programming software in engineering, gaming and other fields.",
                "For C language programmers, it is must to master the complexity of the language to deal with\n" +
                        "programming software in engineering, gaming and other fields. In order to understand each concept of\n" +
                        "the C language, it is necessary to follow a good reference book in easy-to-understand text.\n" +
                        "Keeping lucidity and simplicity in mind, Yashavant P Kanetkar, the author of the book, has compiled it to\n" +
                        "be one of the most interesting C programming books for C language learners. The book begins with the\n" +
                        "basic knowledge of different concepts and further leads to advanced levels. This means the book will\n" +
                        "provide complete knowledge to the readers from basic to complex programming parts.\n" +
                        "It covers various topics that could be easily understood with the help of examples given with each\n" +
                        "programming concept. Besides, the book also features several descriptive details about console input, C\n" +
                        "preprocessor, arrays, functions, strings and pointers. Explained in comprehensive manner, the book\n" +
                        "aims to provide more brief information to all C programming beginners as well as established\n" +
                        "programmers.\n" +
                        "\n" +
                        "‘Let Us C’ can help the readers to prepare not only for the theoretical exams but for the practical exams\n" +
                        "as well. There is also a separate section in the book that includes most frequently asked questions in job\n" +
                        "interviews. Hence, it can be a good reference manual for preparing job interviews as well.");
        booksList.add(books2);

        Books books3 = new Books("Fundamentals of Data Structures in C (Second Edition)2008",
                "Sahni Horowitz", "This new edition provides a comprehensive and technically rigorous introduction to data structures such\n" +
                "as arrays, stacks, queues, linked lists, trees and graphs and techniques such as sorting hashing that\n" +
                "form the basis of all software.",
                "This new edition provides a comprehensive and technically rigorous introduction to data structures such\n" +
                        "as arrays, stacks, queues, linked lists, trees and graphs and techniques such as sorting hashing that\n" +
                        "form the basis of all software. In addition, this text presents advanced or specialized data structures such\n" +
                        "as priority queues, efficient binary search trees, multiway search trees and digital search structures. The\n" +
                        "book now discusses topics such as weight biased leftist trees, pairing heaps, symmetric min–max heaps,\n" +
                        "interval heaps, top-down splay trees, B+ trees and suffix trees. Red-black trees have been made more\n" +
                        "accessible. The section on multiway tries has been significantly expanded and discusses several trie\n" +
                        "variations and their application to Internet packet forwarding.");
        booksList.add(books3);

        Books books4 = new Books("Data Mining: Concepts and Techniques (The Morgan Kaufmann Series in Data Management\n" +
                "Systems)25 July 2011", "Jiawei Han and Micheline Kamber", "Data mining is the task of extracting precious information from masses of raw data.",
                "Data mining is the task of extracting precious information from masses of raw data. The results of data\n" +
                        "mining could find many different uses and more and more companies are investing in this technology.\n" +
                        "Data Mining: Concepts And Techniques (The Morgan Kaufmann Series In Data Management Systems)\n" +
                        "explains all the fundamental tools and techniques involved in the process and also goes into many\n" +
                        "advanced techniques.\n" +
                        "This book not only introduces the fundamentals of data mining, it also explores new and emerging tools\n" +
                        "and techniques. It explains basic data mining concepts like OLAP, concept description, data\n" +
                        "preprocessing, classification and prediction, association rules and cluster analysis. It then presents\n" +
                        "advanced data mining techniques like extracting information from varied and complex sources other than\n" +
                        "just relational databases. This includes multimedia databases, object databases, time-series databases\n" +
                        "and spatial databases. It also looks at harvesting data from varied sources on the world wide web and\n" +
                        "extracting useful information from it.\n" +
                        "Data Mining: Concepts And Techniques (The Morgan Kaufmann Series in Data Management Systems)\n" +
                        "is arranged in such way that the chapters stand as independent units. This makes it flexible as a\n" +
                        "\n" +
                        "classroom material, as instructors can choose the chapters they want and present the lessons in the\n" +
                        "order they prefer.");
        booksList.add(books4);

        Books books5 = new Books("ADVANCED CONCEPTS IN OPERATING SYSTEMS Paperback – 1 Jul 2017",
                "Mukesh Singhal (Author), Niranjan Shivaratri", "Designed for the second course in operating systems, usually called advanced operating systems or\n" +
                "distributed systems, taught in computer-science and computer-engineering departments, this text\n" +
                "provides comprehensive coverage of the fundamental concepts and mechanisms which underlie the\n" +
                "design of advanced operating systems.",
                "Designed for the second course in operating systems, usually called advanced operating systems or\n" +
                        "distributed systems, taught in computer-science and computer-engineering departments, this text\n" +
                        "provides comprehensive coverage of the fundamental concepts and mechanisms which underlie the\n" +
                        "design of advanced operating systems. Numerous examples are provided to reinforce the concepts and\n" +
                        "relevant case studies illustrate the concepts and mechanisms described.\n" +
                        "Operating systems have evolved substantially over the past two decades, and there is a need for a book\n" +
                        "which can explain major developments and changes in this dynamic field. This is such a book.\n" +
                        "Comprehensive, and useful as a text and reference, Advanced Concepts in Operating Systems lays\n" +
                        "down all the concepts and mechanisms involved in the design of advanced operating systems. The\n" +
                        "discussion is reinforced by many examples and cases");
        booksList.add(books5);

        Books books6 = new Books("Data Structures & Algorithms, 1e2002", "AHO", "An ideal book for first course on data structures and algorithms, its text ensures a style and content\n" +
                "relevant to present-day programming.",
                "An ideal book for first course on data structures and algorithms, its text ensures a style and content\n" +
                        "relevant to present-day programming. The only pre-requisite it assumes is familiarity with a high-level\n" +
                        "programming language like Pascal. The book spans cohesively across wide-ranging topics and serves\n" +
                        "as a comprehensive text for the undergraduate as well as the graduate student.\n" +
                        "Data Structures and Algorithms in Java, Second Edition is designed to be easy to read and understand\n" +
                        "although the topic itself is complicated. Algorithms are the procedures that software programs use to\n" +
                        "manipulate data structures. Besides clear and simple example programs, the author includes a workshop\n" +
                        "as a small demonstration program executable on a Web browser. The programs demonstrate in\n" +
                        "graphical form what data structures look like and how they operate. In the second edition, the program is\n" +
                        "rewritten to improve operation and clarify the algorithms, the example programs are revised to work with\n" +
                        "the latest version of the Java JDK, and questions and exercises will be added at the end of each chapter\n" +
                        "making the book even more useful.");
        booksList.add(books6);

        Books books7 = new Books("Data Structures, Algorithms & Applications INC++2005", "S. Silicon Press",
                "This new edition provides a comprehensive coverage of fundamental data structures, making it ideal for\n" +
                        "use in computer science courses.",
                "This new edition provides a comprehensive coverage of fundamental data structures, making it ideal for\n" +
                        "use in computer science courses. It makes significant use of the Standard Templates Library (STL) and\n" +
                        "relates the data structures and algorithms developed in the text to corresponding implementations in the\n" +
                        "STL. Many new examples and exercises also have been included. Real-world applications are a unique\n" +
                        "feature of this text. The author provides several applications for each data structure and algorithm design\n" +
                        "method discussed, taking examples from topics such as sorting, compression and coding and image\n" +
                        "processing. There are almost 1,000 exercises, including comprehension and simple programming\n" +
                        "problems and projects. Additionally, the book has an associated web site that contains all the programs\n" +
                        "in the book, sample data, generated output, solutions to selected exercises and sample tests with\n" +
                        "answers.");
        booksList.add(books7);

        Books books8 = new Books("Data Mining for Business Intelligence: Concepts, Techniques and Applications in Microsoft Office Excel\n" +
                "with XLMiner2008", "Galit Shmueli, Nitin R. Patel, Peter C. Bruce",
                "This book arose out of a data mining course at MIT’s Sloan School of Management.",
                "This book arose out of a data mining course at MIT’s Sloan School of Management. Preparation for the\n" +
                        "course revealed that there are a number of excellent books on the business context of data mining, but\n" +
                        "their coverage of the statistical and machine learning algorithms and theoretical underpinnings is not\n" +
                        "sufficiently detailed to provide a practical guide for users who possess the raw skills and tools to analyze\n" +
                        "data. This book is intended for the business student (and practitioner) of data mining techniques, and the\n" +
                        "goal is threefold: (1) to provide both a theoretical and practical understanding of the key methods of\n" +
                        "classification, prediction, reduction and exploration that are at the heart of data mining; (2) to provide a\n" +
                        "business decision-making context for these methods; and (3) using real business cases and data, to\n" +
                        "\n" +
                        "illustrate the application and interpretation of these methods. The book employs the use of an Excel add-\n" +
                        "in, XLMinerTM, at no cost to registered instructors, in order to illustrate and interpret the various data\n" +
                        "\n" +
                        "sets that are presented throughout. Real-life business cases are also presented so that readers can\n" +
                        "implement algorithms with a very low learning hurdle.");
        booksList.add(books8);

        Books books9 = new Books("Data Structures & Algorithms in Java, 2e2007", "Lafore", "For this Second Edition, Lafore has rewritten each program to improve its operation, clarify the\n" +
                "\n" +
                "algorithms it illustrates and reflect the latest versions of the Java 2 SDK.",
                "For this Second Edition, Lafore has rewritten each program to improve its operation, clarify the\n" +
                        "\n" +
                        "algorithms it illustrates and reflect the latest versions of the Java 2 SDK. Lafore has also added brand-\n" +
                        "new questions and exercises at the end of every chapter. The result: students gain deep mastery over\n" +
                        "\n" +
                        "today's best practices and approaches for manipulating virtually any form of data with Java.\n" +
                        "Data Structures and Algorithms in Java, Second Edition is designed to be easy to read and understand\n" +
                        "although the topic itself is complicated. Algorithms are the procedures that software programs use to\n" +
                        "manipulate data structures. Besides clear and simple example programs, the author includes a workshop\n" +
                        "as a small demonstration program executable on a Web browser. The programs demonstrate in\n" +
                        "graphical form what data structures look like and how they operate. In the second edition, the program is\n" +
                        "rewritten to improve operation and clarify the algorithms, the example programs are revised to work with\n" +
                        "the latest version of the Java JDK, and questions and exercises will be added at the end of each chapter\n" +
                        "making the book even more useful.");
        booksList.add(books9);

        Books books10 = new Books("Applied Cryptography: Protocols, Algorithms and Source Code in C, 2ed2007",
                "Bruce Schneier", "This new edition of the cryptography classic provides you with a comprehensive survey of modern\n" +
                "cryptography.",
                "This new edition of the cryptography classic provides you with a comprehensive survey of modern\n" +
                        "cryptography. The book details how programmers and electronic communications professionals can use\n" +
                        "cryptography-the technique of enciphering and deciphering messages-to maintain the privacy of\n" +
                        "computer data. It describes dozens of cryptography algorithms, gives practical advice on how to\n" +
                        "implement them into cryptographic software, and shows how they can be used to solve security\n" +
                        "problems.\n" +
                        "From the world's most renowned security technologist, Bruce Schneier, this 20th Anniversary Edition is\n" +
                        "the most definitive reference on cryptography ever published and is the seminal work on cryptography.\n" +
                        "Cryptographic techniques have applications far beyond the obvious uses of encoding and decoding\n" +
                        "information. For developers who need to know about capabilities, such as digital signatures, that depend\n" +
                        "on cryptographic techniques, there's no better overview than Applied Cryptography, the definitive book\n" +
                        "on the subject. Bruce Schneier covers general classes of cryptographic protocols and then specific\n" +
                        "techniques, detailing the inner workings of real-world cryptographic algorithms including the Data\n" +
                        "Encryption Standard and RSA public-key cryptosystems. The book includes source-code listings and\n" +
                        "extensive advice on the practical aspects of cryptography implementation, such as the importance of\n" +
                        "generating truly random numbers and of keeping keys secure.\n" +
                        "\n" +
                        "The book details how programmers and electronic communications professionals can use cryptography-\n" +
                        "the technique of enciphering and deciphering messages-to maintain the privacy of computer data. It\n" +
                        "\n" +
                        "describes dozens of cryptography algorithms, gives practical advice on how to implement them into\n" +
                        "cryptographic software, and shows how they can be used to solve security problems. The book shows\n" +
                        "programmers who design computer applications, networks, and storage systems how they can build\n" +
                        "security into their software and systems.");
        booksList.add(books10);


         mAdapter = new BooksAdapter(booksList, getContext());
        listBooks.setAdapter(mAdapter);
        listBooks.setItemAnimator(new DefaultItemAnimator());

        return root;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == 12)
        {
            String mBook = data.getStringExtra("book");
            String mAuthor = data.getStringExtra("author");
            String mDescription = data.getStringExtra("description");
            String mFullDescription = data.getStringExtra("full_description");

            Books books = new Books(mBook,mAuthor,mDescription,mFullDescription);
            booksList.add(books);
            mAdapter.notifyDataSetChanged();


        }
    }
}
