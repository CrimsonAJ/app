.class public abstract LD0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu/k;

.field public static final b:Ljava/lang/Object;

.field public static c:LQ6/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu/k;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LD0/k;->a:Lu/k;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LD0/k;->b:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-object v0, LD0/k;->c:LQ6/f;

    .line 17
    .line 18
    return-void
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
.end method

.method public static a(Landroid/content/Context;)J
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x21

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {v0, p0}, LD0/i;->a(Landroid/content/pm/PackageManager;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 20
    .line 21
    return-wide v0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    .line 32
    .line 33
    return-wide v0
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static b()LQ6/f;
    .locals 2

    .line 1
    new-instance v0, LQ6/f;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, LQ6/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LD0/k;->c:LQ6/f;

    .line 8
    .line 9
    sget-object v1, LD0/k;->a:Lu/k;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lu/g;->j(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    sget-object v0, LD0/k;->c:LQ6/f;

    .line 15
    .line 16
    return-object v0
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
.end method

.method public static c(Landroid/content/Context;Z)V
    .locals 18

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object v0, LD0/k;->c:LQ6/f;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    sget-object v1, LD0/k;->b:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    :try_start_0
    sget-object v0, LD0/k;->c:LQ6/f;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    monitor-exit v1

    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto/16 :goto_7

    .line 22
    .line 23
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    .line 25
    const/16 v2, 0x1c

    .line 26
    .line 27
    if-lt v0, v2, :cond_e

    .line 28
    .line 29
    const/16 v2, 0x1e

    .line 30
    .line 31
    if-ne v0, v2, :cond_2

    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_2
    new-instance v0, Ljava/io/File;

    .line 36
    .line 37
    new-instance v2, Ljava/io/File;

    .line 38
    .line 39
    const-string v3, "/data/misc/profiles/ref/"

    .line 40
    .line 41
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v3, "primary.prof"

    .line 49
    .line 50
    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const/4 v4, 0x0

    .line 62
    const-wide/16 v5, 0x0

    .line 63
    .line 64
    const/4 v7, 0x1

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    cmp-long v0, v2, v5

    .line 68
    .line 69
    if-lez v0, :cond_3

    .line 70
    .line 71
    move v0, v7

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move v0, v4

    .line 74
    :goto_0
    new-instance v8, Ljava/io/File;

    .line 75
    .line 76
    new-instance v9, Ljava/io/File;

    .line 77
    .line 78
    const-string v10, "/data/misc/profiles/cur/0/"

    .line 79
    .line 80
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    invoke-direct {v9, v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v10, "primary.prof"

    .line 88
    .line 89
    invoke-direct {v8, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 93
    .line 94
    .line 95
    move-result-wide v16

    .line 96
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 97
    .line 98
    .line 99
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    if-eqz v8, :cond_4

    .line 101
    .line 102
    cmp-long v5, v16, v5

    .line 103
    .line 104
    if-lez v5, :cond_4

    .line 105
    .line 106
    move v5, v7

    .line 107
    goto :goto_1

    .line 108
    :cond_4
    move v5, v4

    .line 109
    :goto_1
    :try_start_1
    invoke-static/range {p0 .. p0}, LD0/k;->a(Landroid/content/Context;)J

    .line 110
    .line 111
    .line 112
    move-result-wide v14
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    :try_start_2
    new-instance v6, Ljava/io/File;

    .line 114
    .line 115
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    const-string v9, "profileInstalled"

    .line 120
    .line 121
    invoke-direct {v6, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 125
    .line 126
    .line 127
    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    if-eqz v8, :cond_5

    .line 129
    .line 130
    :try_start_3
    invoke-static {v6}, LD0/j;->a(Ljava/io/File;)LD0/j;

    .line 131
    .line 132
    .line 133
    move-result-object v8
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 134
    goto :goto_2

    .line 135
    :catch_0
    :try_start_4
    invoke-static {}, LD0/k;->b()LQ6/f;

    .line 136
    .line 137
    .line 138
    monitor-exit v1

    .line 139
    goto :goto_5

    .line 140
    :cond_5
    const/4 v8, 0x0

    .line 141
    :goto_2
    const/4 v9, 0x2

    .line 142
    if-eqz v8, :cond_7

    .line 143
    .line 144
    iget-wide v10, v8, LD0/j;->c:J

    .line 145
    .line 146
    cmp-long v10, v10, v14

    .line 147
    .line 148
    if-nez v10, :cond_7

    .line 149
    .line 150
    iget v10, v8, LD0/j;->b:I

    .line 151
    .line 152
    if-ne v10, v9, :cond_6

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_6
    move v4, v10

    .line 156
    goto :goto_4

    .line 157
    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    .line 158
    .line 159
    move v4, v7

    .line 160
    goto :goto_4

    .line 161
    :cond_8
    if-eqz v5, :cond_9

    .line 162
    .line 163
    move v4, v9

    .line 164
    :cond_9
    :goto_4
    if-eqz p1, :cond_a

    .line 165
    .line 166
    if-eqz v5, :cond_a

    .line 167
    .line 168
    if-eq v4, v7, :cond_a

    .line 169
    .line 170
    move v4, v9

    .line 171
    :cond_a
    if-eqz v8, :cond_b

    .line 172
    .line 173
    iget v0, v8, LD0/j;->b:I

    .line 174
    .line 175
    if-ne v0, v9, :cond_b

    .line 176
    .line 177
    if-ne v4, v7, :cond_b

    .line 178
    .line 179
    iget-wide v9, v8, LD0/j;->d:J

    .line 180
    .line 181
    cmp-long v0, v2, v9

    .line 182
    .line 183
    if-gez v0, :cond_b

    .line 184
    .line 185
    const/4 v4, 0x3

    .line 186
    :cond_b
    move v13, v4

    .line 187
    new-instance v11, LD0/j;

    .line 188
    .line 189
    const/4 v12, 0x1

    .line 190
    invoke-direct/range {v11 .. v17}, LD0/j;-><init>(IIJJ)V

    .line 191
    .line 192
    .line 193
    if-eqz v8, :cond_c

    .line 194
    .line 195
    invoke-virtual {v8, v11}, LD0/j;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 199
    if-nez v0, :cond_d

    .line 200
    .line 201
    :cond_c
    :try_start_5
    invoke-virtual {v11, v6}, LD0/j;->b(Ljava/io/File;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 202
    .line 203
    .line 204
    :catch_1
    :cond_d
    :try_start_6
    invoke-static {}, LD0/k;->b()LQ6/f;

    .line 205
    .line 206
    .line 207
    monitor-exit v1

    .line 208
    goto :goto_5

    .line 209
    :catch_2
    invoke-static {}, LD0/k;->b()LQ6/f;

    .line 210
    .line 211
    .line 212
    monitor-exit v1

    .line 213
    :goto_5
    return-void

    .line 214
    :cond_e
    :goto_6
    invoke-static {}, LD0/k;->b()LQ6/f;

    .line 215
    .line 216
    .line 217
    monitor-exit v1

    .line 218
    return-void

    .line 219
    :goto_7
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 220
    throw v0
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
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
