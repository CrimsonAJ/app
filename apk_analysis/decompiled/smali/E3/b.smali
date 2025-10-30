.class public final LE3/b;
.super Lv4/e;
.source "SourceFile"


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LE3/b;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a0(LA4/r;)LF3/a;
    .locals 8

    .line 1
    invoke-virtual {p0}, LA4/r;->r()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, LA4/r;->r()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LA4/r;->q()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-virtual {p0}, LA4/r;->q()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    iget-object v0, p0, LA4/r;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, [B

    .line 26
    .line 27
    iget v7, p0, LA4/r;->a:I

    .line 28
    .line 29
    iget p0, p0, LA4/r;->b:I

    .line 30
    .line 31
    invoke-static {v0, v7, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    new-instance v0, LF3/a;

    .line 36
    .line 37
    invoke-direct/range {v0 .. v7}, LF3/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 38
    .line 39
    .line 40
    return-object v0
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method


# virtual methods
.method public final j(LD3/e;Ljava/nio/ByteBuffer;)LD3/c;
    .locals 18

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/16 v2, 0x8

    .line 4
    .line 5
    move-object/from16 v3, p0

    .line 6
    .line 7
    iget v4, v3, LE3/b;->h:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v2, LD3/c;

    .line 13
    .line 14
    new-instance v4, LA4/r;

    .line 15
    .line 16
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    invoke-direct {v4, v6, v5}, LA4/r;-><init>(I[B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v4}, LE3/b;->a0(LA4/r;)LF3/a;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    new-array v1, v1, [LD3/b;

    .line 32
    .line 33
    aput-object v4, v1, v0

    .line 34
    .line 35
    invoke-direct {v2, v1}, LD3/c;-><init>([LD3/b;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :pswitch_0
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/16 v5, 0x74

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    if-ne v4, v5, :cond_7

    .line 47
    .line 48
    new-instance v4, LZ3/f;

    .line 49
    .line 50
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    invoke-direct {v4, v7, v5}, LZ3/f;-><init>(I[B)V

    .line 59
    .line 60
    .line 61
    const/16 v5, 0xc

    .line 62
    .line 63
    invoke-virtual {v4, v5}, LZ3/f;->r(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v5}, LZ3/f;->i(I)I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    invoke-virtual {v4}, LZ3/f;->f()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    add-int/2addr v8, v7

    .line 75
    const/4 v7, 0x4

    .line 76
    sub-int/2addr v8, v7

    .line 77
    const/16 v9, 0x2c

    .line 78
    .line 79
    invoke-virtual {v4, v9}, LZ3/f;->r(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v5}, LZ3/f;->i(I)I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    invoke-virtual {v4, v9}, LZ3/f;->s(I)V

    .line 87
    .line 88
    .line 89
    const/16 v9, 0x10

    .line 90
    .line 91
    invoke-virtual {v4, v9}, LZ3/f;->r(I)V

    .line 92
    .line 93
    .line 94
    new-instance v10, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    :goto_0
    invoke-virtual {v4}, LZ3/f;->f()I

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    if-ge v11, v8, :cond_5

    .line 104
    .line 105
    const/16 v11, 0x30

    .line 106
    .line 107
    invoke-virtual {v4, v11}, LZ3/f;->r(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v2}, LZ3/f;->i(I)I

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    invoke-virtual {v4, v7}, LZ3/f;->r(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, v5}, LZ3/f;->i(I)I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    invoke-virtual {v4}, LZ3/f;->f()I

    .line 122
    .line 123
    .line 124
    move-result v13

    .line 125
    add-int/2addr v13, v12

    .line 126
    move-object v12, v6

    .line 127
    move-object v14, v12

    .line 128
    :goto_1
    invoke-virtual {v4}, LZ3/f;->f()I

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    if-ge v15, v13, :cond_3

    .line 133
    .line 134
    invoke-virtual {v4, v2}, LZ3/f;->i(I)I

    .line 135
    .line 136
    .line 137
    move-result v15

    .line 138
    invoke-virtual {v4, v2}, LZ3/f;->i(I)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-virtual {v4}, LZ3/f;->f()I

    .line 143
    .line 144
    .line 145
    move-result v16

    .line 146
    move/from16 v17, v1

    .line 147
    .line 148
    add-int v1, v16, v0

    .line 149
    .line 150
    const/4 v5, 0x2

    .line 151
    if-ne v15, v5, :cond_1

    .line 152
    .line 153
    invoke-virtual {v4, v9}, LZ3/f;->i(I)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    invoke-virtual {v4, v2}, LZ3/f;->r(I)V

    .line 158
    .line 159
    .line 160
    const/4 v5, 0x3

    .line 161
    if-ne v0, v5, :cond_2

    .line 162
    .line 163
    :goto_2
    invoke-virtual {v4}, LZ3/f;->f()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-ge v0, v1, :cond_2

    .line 168
    .line 169
    invoke-virtual {v4, v2}, LZ3/f;->i(I)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    sget-object v5, LO5/e;->a:Ljava/nio/charset/Charset;

    .line 174
    .line 175
    new-array v12, v0, [B

    .line 176
    .line 177
    invoke-virtual {v4, v0, v12}, LZ3/f;->k(I[B)V

    .line 178
    .line 179
    .line 180
    new-instance v0, Ljava/lang/String;

    .line 181
    .line 182
    invoke-direct {v0, v12, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, v2}, LZ3/f;->i(I)I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    const/4 v12, 0x0

    .line 190
    :goto_3
    if-ge v12, v5, :cond_0

    .line 191
    .line 192
    invoke-virtual {v4, v2}, LZ3/f;->i(I)I

    .line 193
    .line 194
    .line 195
    move-result v15

    .line 196
    invoke-virtual {v4, v15}, LZ3/f;->s(I)V

    .line 197
    .line 198
    .line 199
    add-int/lit8 v12, v12, 0x1

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_0
    move-object v12, v0

    .line 203
    goto :goto_2

    .line 204
    :cond_1
    const/16 v5, 0x15

    .line 205
    .line 206
    if-ne v15, v5, :cond_2

    .line 207
    .line 208
    sget-object v5, LO5/e;->a:Ljava/nio/charset/Charset;

    .line 209
    .line 210
    new-array v14, v0, [B

    .line 211
    .line 212
    invoke-virtual {v4, v0, v14}, LZ3/f;->k(I[B)V

    .line 213
    .line 214
    .line 215
    new-instance v0, Ljava/lang/String;

    .line 216
    .line 217
    invoke-direct {v0, v14, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 218
    .line 219
    .line 220
    move-object v14, v0

    .line 221
    :cond_2
    mul-int/2addr v1, v2

    .line 222
    invoke-virtual {v4, v1}, LZ3/f;->o(I)V

    .line 223
    .line 224
    .line 225
    move/from16 v1, v17

    .line 226
    .line 227
    const/4 v0, 0x0

    .line 228
    const/16 v5, 0xc

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_3
    move/from16 v17, v1

    .line 232
    .line 233
    mul-int/2addr v13, v2

    .line 234
    invoke-virtual {v4, v13}, LZ3/f;->o(I)V

    .line 235
    .line 236
    .line 237
    if-eqz v12, :cond_4

    .line 238
    .line 239
    if-eqz v14, :cond_4

    .line 240
    .line 241
    new-instance v0, LE3/a;

    .line 242
    .line 243
    invoke-virtual {v12, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-direct {v0, v11, v1}, LE3/a;-><init>(ILjava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    :cond_4
    move/from16 v1, v17

    .line 254
    .line 255
    const/4 v0, 0x0

    .line 256
    const/16 v5, 0xc

    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_5
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_6

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_6
    new-instance v6, LD3/c;

    .line 268
    .line 269
    invoke-direct {v6, v10}, LD3/c;-><init>(Ljava/util/List;)V

    .line 270
    .line 271
    .line 272
    :cond_7
    :goto_4
    return-object v6

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
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
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method
