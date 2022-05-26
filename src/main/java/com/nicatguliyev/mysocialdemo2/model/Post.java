package com.nicatguliyev.mysocialdemo2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "post")
public class Post {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String description;
        private Long owner_id;
        private Date createdDate;
}
