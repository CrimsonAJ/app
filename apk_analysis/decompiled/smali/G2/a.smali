.class public final LG2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG2/q;


# direct methods
.method public static a(Lcom/anilab/data/model/response/ListEpisodeResponse;)Ljava/util/List;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "dto"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, LB7/t;->a:LB7/t;

    .line 9
    .line 10
    iget-object v2, v0, Lcom/anilab/data/model/response/ListEpisodeResponse;->b:Ljava/util/List;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    move-object v2, v1

    .line 15
    :cond_0
    invoke-static {v2}, LB7/k;->I0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/4 v5, 0x0

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    move-object v4, v5

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-nez v8, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move-object v8, v4

    .line 46
    check-cast v8, Lcom/anilab/data/model/response/ContinueWatchResponse;

    .line 47
    .line 48
    iget-object v8, v8, Lcom/anilab/data/model/response/ContinueWatchResponse;->h:Ljava/lang/Long;

    .line 49
    .line 50
    if-eqz v8, :cond_3

    .line 51
    .line 52
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v8

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    move-wide v8, v6

    .line 58
    :cond_4
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    move-object v11, v10

    .line 63
    check-cast v11, Lcom/anilab/data/model/response/ContinueWatchResponse;

    .line 64
    .line 65
    iget-object v11, v11, Lcom/anilab/data/model/response/ContinueWatchResponse;->h:Ljava/lang/Long;

    .line 66
    .line 67
    if-eqz v11, :cond_5

    .line 68
    .line 69
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 70
    .line 71
    .line 72
    move-result-wide v11

    .line 73
    goto :goto_1

    .line 74
    :cond_5
    move-wide v11, v6

    .line 75
    :goto_1
    cmp-long v13, v8, v11

    .line 76
    .line 77
    if-gez v13, :cond_6

    .line 78
    .line 79
    move-object v4, v10

    .line 80
    move-wide v8, v11

    .line 81
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-nez v10, :cond_4

    .line 86
    .line 87
    :goto_2
    check-cast v4, Lcom/anilab/data/model/response/ContinueWatchResponse;

    .line 88
    .line 89
    if-eqz v4, :cond_7

    .line 90
    .line 91
    iget-object v3, v4, Lcom/anilab/data/model/response/ContinueWatchResponse;->d:Ljava/lang/Long;

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_7
    move-object v3, v5

    .line 95
    :goto_3
    const/4 v4, 0x1

    .line 96
    iget-object v0, v0, Lcom/anilab/data/model/response/ListEpisodeResponse;->a:Ljava/util/List;

    .line 97
    .line 98
    if-eqz v0, :cond_11

    .line 99
    .line 100
    new-instance v5, Ljava/util/ArrayList;

    .line 101
    .line 102
    const/16 v8, 0xa

    .line 103
    .line 104
    invoke-static {v0, v8}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_11

    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    check-cast v8, Lcom/anilab/data/model/response/EpisodeResponse;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    const/4 v10, 0x0

    .line 132
    move v11, v10

    .line 133
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    if-eqz v12, :cond_b

    .line 138
    .line 139
    add-int/lit8 v12, v11, 0x1

    .line 140
    .line 141
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v13

    .line 145
    check-cast v13, Lcom/anilab/data/model/response/ContinueWatchResponse;

    .line 146
    .line 147
    iget-object v14, v13, Lcom/anilab/data/model/response/ContinueWatchResponse;->d:Ljava/lang/Long;

    .line 148
    .line 149
    iget-object v15, v8, Lcom/anilab/data/model/response/EpisodeResponse;->a:Ljava/lang/Long;

    .line 150
    .line 151
    invoke-static {v14, v15}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-eqz v14, :cond_a

    .line 156
    .line 157
    iget-object v9, v13, Lcom/anilab/data/model/response/ContinueWatchResponse;->f:Ljava/lang/Long;

    .line 158
    .line 159
    if-eqz v9, :cond_8

    .line 160
    .line 161
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 162
    .line 163
    .line 164
    move-result-wide v14

    .line 165
    goto :goto_6

    .line 166
    :cond_8
    move-wide v14, v6

    .line 167
    :goto_6
    iget-object v9, v13, Lcom/anilab/data/model/response/ContinueWatchResponse;->g:Ljava/lang/Float;

    .line 168
    .line 169
    if-eqz v9, :cond_9

    .line 170
    .line 171
    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    const/high16 v12, 0x42c80000    # 100.0f

    .line 176
    .line 177
    cmpl-float v9, v9, v12

    .line 178
    .line 179
    if-nez v9, :cond_9

    .line 180
    .line 181
    move v9, v4

    .line 182
    goto :goto_7

    .line 183
    :cond_9
    move v9, v10

    .line 184
    :goto_7
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move/from16 v28, v9

    .line 188
    .line 189
    move-wide/from16 v25, v14

    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_a
    move v11, v12

    .line 193
    goto :goto_5

    .line 194
    :cond_b
    move-wide/from16 v25, v6

    .line 195
    .line 196
    move/from16 v28, v10

    .line 197
    .line 198
    :goto_8
    if-eqz v3, :cond_c

    .line 199
    .line 200
    iget-object v9, v8, Lcom/anilab/data/model/response/EpisodeResponse;->a:Ljava/lang/Long;

    .line 201
    .line 202
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-eqz v9, :cond_c

    .line 207
    .line 208
    move/from16 v27, v4

    .line 209
    .line 210
    goto :goto_9

    .line 211
    :cond_c
    move/from16 v27, v10

    .line 212
    .line 213
    :goto_9
    new-instance v16, LI2/a;

    .line 214
    .line 215
    iget-object v9, v8, Lcom/anilab/data/model/response/EpisodeResponse;->a:Ljava/lang/Long;

    .line 216
    .line 217
    if-eqz v9, :cond_d

    .line 218
    .line 219
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 220
    .line 221
    .line 222
    move-result-wide v11

    .line 223
    move-wide/from16 v17, v11

    .line 224
    .line 225
    goto :goto_a

    .line 226
    :cond_d
    move-wide/from16 v17, v6

    .line 227
    .line 228
    :goto_a
    iget-object v9, v8, Lcom/anilab/data/model/response/EpisodeResponse;->c:Ljava/lang/Integer;

    .line 229
    .line 230
    if-eqz v9, :cond_e

    .line 231
    .line 232
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    move/from16 v19, v9

    .line 237
    .line 238
    goto :goto_b

    .line 239
    :cond_e
    move/from16 v19, v10

    .line 240
    .line 241
    :goto_b
    iget-object v8, v8, Lcom/anilab/data/model/response/EpisodeResponse;->d:Ljava/lang/Integer;

    .line 242
    .line 243
    if-nez v8, :cond_f

    .line 244
    .line 245
    goto :goto_c

    .line 246
    :cond_f
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    if-ne v8, v4, :cond_10

    .line 251
    .line 252
    move/from16 v29, v4

    .line 253
    .line 254
    goto :goto_d

    .line 255
    :cond_10
    :goto_c
    move/from16 v29, v10

    .line 256
    .line 257
    :goto_d
    const/16 v23, 0x0

    .line 258
    .line 259
    const/16 v24, 0x0

    .line 260
    .line 261
    const/16 v20, 0x0

    .line 262
    .line 263
    const/16 v21, 0x0

    .line 264
    .line 265
    const/16 v22, 0x0

    .line 266
    .line 267
    const/16 v30, 0x4fc

    .line 268
    .line 269
    invoke-direct/range {v16 .. v30}, LI2/a;-><init>(JILjava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;LI2/b;JZZZI)V

    .line 270
    .line 271
    .line 272
    move-object/from16 v8, v16

    .line 273
    .line 274
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    goto/16 :goto_4

    .line 278
    .line 279
    :cond_11
    if-nez v3, :cond_13

    .line 280
    .line 281
    if-eqz v5, :cond_13

    .line 282
    .line 283
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-eqz v0, :cond_12

    .line 288
    .line 289
    goto :goto_e

    .line 290
    :cond_12
    invoke-static {v5}, LB7/k;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    check-cast v0, LI2/a;

    .line 295
    .line 296
    iput-boolean v4, v0, LI2/a;->j:Z

    .line 297
    .line 298
    :cond_13
    :goto_e
    if-nez v5, :cond_14

    .line 299
    .line 300
    return-object v1

    .line 301
    :cond_14
    return-object v5
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method


# virtual methods
.method public final bridge synthetic n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/anilab/data/model/response/ListEpisodeResponse;

    .line 2
    .line 3
    invoke-static {p1}, LG2/a;->a(Lcom/anilab/data/model/response/ListEpisodeResponse;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
