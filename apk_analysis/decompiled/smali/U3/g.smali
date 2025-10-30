.class public final LU3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/j;


# instance fields
.field public final a:LV3/h;

.field public final b:LA4/r;

.field public final c:LA4/r;

.field public final d:I

.field public final e:Ljava/lang/Object;

.field public final f:LU3/k;

.field public g:Lq3/l;

.field public h:Z

.field public volatile i:J

.field public volatile j:I

.field public k:Z

.field public l:J

.field public m:J


# direct methods
.method public constructor <init>(LU3/l;I)V
    .locals 5

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, -0x1

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput p2, p0, LU3/g;->d:I

    .line 9
    .line 10
    iget-object p2, p1, LU3/l;->c:Lj3/M;

    .line 11
    .line 12
    iget-object p2, p2, Lj3/M;->l:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    sparse-switch v4, :sswitch_data_0

    .line 22
    .line 23
    .line 24
    :goto_0
    move p2, v1

    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :sswitch_0
    const-string v4, "audio/g711-mlaw"

    .line 28
    .line 29
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-nez p2, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/16 p2, 0xd

    .line 37
    .line 38
    goto/16 :goto_1

    .line 39
    .line 40
    :sswitch_1
    const-string v4, "audio/g711-alaw"

    .line 41
    .line 42
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-nez p2, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/16 p2, 0xc

    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :sswitch_2
    const-string v4, "video/x-vnd.on2.vp9"

    .line 54
    .line 55
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-nez p2, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/16 p2, 0xb

    .line 63
    .line 64
    goto/16 :goto_1

    .line 65
    .line 66
    :sswitch_3
    const-string v4, "video/x-vnd.on2.vp8"

    .line 67
    .line 68
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    const/16 p2, 0xa

    .line 76
    .line 77
    goto/16 :goto_1

    .line 78
    .line 79
    :sswitch_4
    const-string v4, "audio/opus"

    .line 80
    .line 81
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-nez p2, :cond_4

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    const/16 p2, 0x9

    .line 89
    .line 90
    goto/16 :goto_1

    .line 91
    .line 92
    :sswitch_5
    const-string v4, "audio/3gpp"

    .line 93
    .line 94
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-nez p2, :cond_5

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    const/16 p2, 0x8

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :sswitch_6
    const-string v4, "video/avc"

    .line 106
    .line 107
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-nez p2, :cond_6

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    const/4 p2, 0x7

    .line 115
    goto :goto_1

    .line 116
    :sswitch_7
    const-string v4, "video/mp4v-es"

    .line 117
    .line 118
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-nez p2, :cond_7

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_7
    const/4 p2, 0x6

    .line 126
    goto :goto_1

    .line 127
    :sswitch_8
    const-string v4, "audio/raw"

    .line 128
    .line 129
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-nez p2, :cond_8

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_8
    move p2, v0

    .line 137
    goto :goto_1

    .line 138
    :sswitch_9
    const-string v4, "audio/ac3"

    .line 139
    .line 140
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    if-nez p2, :cond_9

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_9
    const/4 p2, 0x4

    .line 148
    goto :goto_1

    .line 149
    :sswitch_a
    const-string v4, "audio/mp4a-latm"

    .line 150
    .line 151
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    if-nez p2, :cond_a

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :cond_a
    const/4 p2, 0x3

    .line 160
    goto :goto_1

    .line 161
    :sswitch_b
    const-string v4, "audio/amr-wb"

    .line 162
    .line 163
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    if-nez p2, :cond_b

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_b
    const/4 p2, 0x2

    .line 172
    goto :goto_1

    .line 173
    :sswitch_c
    const-string v4, "video/hevc"

    .line 174
    .line 175
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    if-nez p2, :cond_c

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_c
    move p2, v2

    .line 184
    goto :goto_1

    .line 185
    :sswitch_d
    const-string v4, "video/3gpp"

    .line 186
    .line 187
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    if-nez p2, :cond_d

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_d
    move p2, v3

    .line 196
    :goto_1
    packed-switch p2, :pswitch_data_0

    .line 197
    .line 198
    .line 199
    const/4 p1, 0x0

    .line 200
    goto :goto_3

    .line 201
    :pswitch_0
    new-instance p2, LV3/d;

    .line 202
    .line 203
    invoke-direct {p2, p1, v2}, LV3/d;-><init>(LU3/l;I)V

    .line 204
    .line 205
    .line 206
    :goto_2
    move-object p1, p2

    .line 207
    goto :goto_3

    .line 208
    :pswitch_1
    new-instance p2, LV3/i;

    .line 209
    .line 210
    invoke-direct {p2, p1}, LV3/i;-><init>(LU3/l;)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :pswitch_2
    new-instance p2, LV3/g;

    .line 215
    .line 216
    invoke-direct {p2, p1}, LV3/g;-><init>(LU3/l;)V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :pswitch_3
    new-instance p2, LV3/e;

    .line 221
    .line 222
    invoke-direct {p2, p1, v3}, LV3/e;-><init>(LU3/l;I)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :pswitch_4
    new-instance p2, LN3/v;

    .line 227
    .line 228
    invoke-direct {p2, p1}, LN3/v;-><init>(LU3/l;)V

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :pswitch_5
    new-instance p2, LD4/z;

    .line 233
    .line 234
    invoke-direct {p2, p1}, LD4/z;-><init>(LU3/l;)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :pswitch_6
    new-instance p2, LV3/b;

    .line 239
    .line 240
    invoke-direct {p2, p1}, LV3/b;-><init>(LU3/l;)V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :pswitch_7
    iget-object p2, p1, LU3/l;->e:Ljava/lang/String;

    .line 245
    .line 246
    const-string v2, "MP4A-LATM"

    .line 247
    .line 248
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result p2

    .line 252
    if-eqz p2, :cond_e

    .line 253
    .line 254
    new-instance p2, LV3/f;

    .line 255
    .line 256
    invoke-direct {p2, p1}, LV3/f;-><init>(LU3/l;)V

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_e
    new-instance p2, LV3/a;

    .line 261
    .line 262
    invoke-direct {p2, p1}, LV3/a;-><init>(LU3/l;)V

    .line 263
    .line 264
    .line 265
    goto :goto_2

    .line 266
    :pswitch_8
    new-instance p2, LV3/c;

    .line 267
    .line 268
    invoke-direct {p2, p1}, LV3/c;-><init>(LU3/l;)V

    .line 269
    .line 270
    .line 271
    goto :goto_2

    .line 272
    :pswitch_9
    new-instance p2, LV3/e;

    .line 273
    .line 274
    invoke-direct {p2, p1, v2}, LV3/e;-><init>(LU3/l;I)V

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :pswitch_a
    new-instance p2, LV3/d;

    .line 279
    .line 280
    invoke-direct {p2, p1, v3}, LV3/d;-><init>(LU3/l;I)V

    .line 281
    .line 282
    .line 283
    goto :goto_2

    .line 284
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iput-object p1, p0, LU3/g;->a:LV3/h;

    .line 288
    .line 289
    new-instance p1, LA4/r;

    .line 290
    .line 291
    const p2, 0xffe3

    .line 292
    .line 293
    .line 294
    invoke-direct {p1, p2}, LA4/r;-><init>(I)V

    .line 295
    .line 296
    .line 297
    iput-object p1, p0, LU3/g;->b:LA4/r;

    .line 298
    .line 299
    new-instance p1, LA4/r;

    .line 300
    .line 301
    invoke-direct {p1, v0, v3}, LA4/r;-><init>(IZ)V

    .line 302
    .line 303
    .line 304
    iput-object p1, p0, LU3/g;->c:LA4/r;

    .line 305
    .line 306
    new-instance p1, Ljava/lang/Object;

    .line 307
    .line 308
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 309
    .line 310
    .line 311
    iput-object p1, p0, LU3/g;->e:Ljava/lang/Object;

    .line 312
    .line 313
    new-instance p1, LU3/k;

    .line 314
    .line 315
    invoke-direct {p1}, LU3/k;-><init>()V

    .line 316
    .line 317
    .line 318
    iput-object p1, p0, LU3/g;->f:LU3/k;

    .line 319
    .line 320
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    iput-wide p1, p0, LU3/g;->i:J

    .line 326
    .line 327
    iput v1, p0, LU3/g;->j:I

    .line 328
    .line 329
    iput-wide p1, p0, LU3/g;->l:J

    .line 330
    .line 331
    iput-wide p1, p0, LU3/g;->m:J

    .line 332
    .line 333
    return-void

    .line 334
    nop

    .line 335
    :sswitch_data_0
    .sparse-switch
        -0x63306f58 -> :sswitch_d
        -0x63185e82 -> :sswitch_c
        -0x5fc6f775 -> :sswitch_b
        -0x3313c2e -> :sswitch_a
        0xb269698 -> :sswitch_9
        0xb26d66f -> :sswitch_8
        0x46cdc642 -> :sswitch_7
        0x4f62373a -> :sswitch_6
        0x59976a2d -> :sswitch_5
        0x59b2d2d8 -> :sswitch_4
        0x5f50bed8 -> :sswitch_3
        0x5f50bed9 -> :sswitch_2
        0x71710385 -> :sswitch_1
        0x717677f9 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_8
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_5
        :pswitch_5
    .end packed-switch
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


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
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
.end method

.method public final b(JJ)V
    .locals 2

    .line 1
    iget-object v0, p0, LU3/g;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LU3/g;->k:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, LU3/g;->k:Z

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    iput-wide p1, p0, LU3/g;->l:J

    .line 15
    .line 16
    iput-wide p3, p0, LU3/g;->m:J

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p1
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
    .line 39
    .line 40
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
.end method

.method public final f(Lq3/k;Lc7/j;)I
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LU3/g;->g:Lq3/l;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, LU3/g;->b:LA4/r;

    .line 9
    .line 10
    iget-object v0, v0, LA4/r;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, [B

    .line 13
    .line 14
    move-object/from16 v2, p1

    .line 15
    .line 16
    check-cast v2, Lq3/g;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const v4, 0xffe3

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0, v3, v4}, Lq3/g;->D([BII)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v2, -0x1

    .line 27
    if-ne v0, v2, :cond_0

    .line 28
    .line 29
    return v2

    .line 30
    :cond_0
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_1
    iget-object v4, v1, LU3/g;->b:LA4/r;

    .line 35
    .line 36
    invoke-virtual {v4, v3}, LA4/r;->H(I)V

    .line 37
    .line 38
    .line 39
    iget-object v4, v1, LU3/g;->b:LA4/r;

    .line 40
    .line 41
    invoke-virtual {v4, v0}, LA4/r;->G(I)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v1, LU3/g;->b:LA4/r;

    .line 45
    .line 46
    invoke-virtual {v0}, LA4/r;->e()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const/4 v5, 0x1

    .line 51
    const/16 v6, 0xc

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    if-ge v4, v6, :cond_2

    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_2
    invoke-virtual {v0}, LA4/r;->x()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    shr-int/lit8 v6, v4, 0x6

    .line 63
    .line 64
    int-to-byte v6, v6

    .line 65
    and-int/lit8 v4, v4, 0xf

    .line 66
    .line 67
    int-to-byte v4, v4

    .line 68
    const/4 v8, 0x2

    .line 69
    if-eq v6, v8, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    invoke-virtual {v0}, LA4/r;->x()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    shr-int/lit8 v7, v6, 0x7

    .line 77
    .line 78
    and-int/2addr v7, v5

    .line 79
    if-ne v7, v5, :cond_4

    .line 80
    .line 81
    move v7, v5

    .line 82
    goto :goto_0

    .line 83
    :cond_4
    move v7, v3

    .line 84
    :goto_0
    and-int/lit8 v6, v6, 0x7f

    .line 85
    .line 86
    int-to-byte v6, v6

    .line 87
    invoke-virtual {v0}, LA4/r;->C()I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    invoke-virtual {v0}, LA4/r;->y()J

    .line 92
    .line 93
    .line 94
    move-result-wide v9

    .line 95
    invoke-virtual {v0}, LA4/r;->i()I

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    sget-object v12, LU3/i;->g:[B

    .line 100
    .line 101
    if-lez v4, :cond_5

    .line 102
    .line 103
    mul-int/lit8 v13, v4, 0x4

    .line 104
    .line 105
    new-array v13, v13, [B

    .line 106
    .line 107
    move v14, v3

    .line 108
    :goto_1
    if-ge v14, v4, :cond_5

    .line 109
    .line 110
    mul-int/lit8 v15, v14, 0x4

    .line 111
    .line 112
    const/4 v5, 0x4

    .line 113
    invoke-virtual {v0, v13, v15, v5}, LA4/r;->h([BII)V

    .line 114
    .line 115
    .line 116
    add-int/lit8 v14, v14, 0x1

    .line 117
    .line 118
    const/4 v5, 0x1

    .line 119
    goto :goto_1

    .line 120
    :cond_5
    invoke-virtual {v0}, LA4/r;->e()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    new-array v4, v4, [B

    .line 125
    .line 126
    invoke-virtual {v0}, LA4/r;->e()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    invoke-virtual {v0, v4, v3, v5}, LA4/r;->h([BII)V

    .line 131
    .line 132
    .line 133
    new-instance v0, LU3/h;

    .line 134
    .line 135
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 136
    .line 137
    .line 138
    iput-object v12, v0, LU3/h;->f:[B

    .line 139
    .line 140
    iput-boolean v7, v0, LU3/h;->a:Z

    .line 141
    .line 142
    iput-byte v6, v0, LU3/h;->b:B

    .line 143
    .line 144
    const v5, 0xffff

    .line 145
    .line 146
    .line 147
    if-ltz v8, :cond_6

    .line 148
    .line 149
    if-gt v8, v5, :cond_6

    .line 150
    .line 151
    const/4 v6, 0x1

    .line 152
    goto :goto_2

    .line 153
    :cond_6
    move v6, v3

    .line 154
    :goto_2
    invoke-static {v6}, Ll4/a;->h(Z)V

    .line 155
    .line 156
    .line 157
    and-int/2addr v5, v8

    .line 158
    iput v5, v0, LU3/h;->c:I

    .line 159
    .line 160
    iput-wide v9, v0, LU3/h;->d:J

    .line 161
    .line 162
    iput v11, v0, LU3/h;->e:I

    .line 163
    .line 164
    iput-object v4, v0, LU3/h;->f:[B

    .line 165
    .line 166
    new-instance v7, LU3/i;

    .line 167
    .line 168
    invoke-direct {v7, v0}, LU3/i;-><init>(LU3/h;)V

    .line 169
    .line 170
    .line 171
    :goto_3
    if-nez v7, :cond_7

    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 175
    .line 176
    .line 177
    move-result-wide v4

    .line 178
    const-wide/16 v8, 0x1e

    .line 179
    .line 180
    sub-long v8, v4, v8

    .line 181
    .line 182
    iget-object v0, v1, LU3/g;->f:LU3/k;

    .line 183
    .line 184
    invoke-virtual {v0, v7, v4, v5}, LU3/k;->c(LU3/i;J)V

    .line 185
    .line 186
    .line 187
    iget-object v0, v1, LU3/g;->f:LU3/k;

    .line 188
    .line 189
    invoke-virtual {v0, v8, v9}, LU3/k;->d(J)LU3/i;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-nez v0, :cond_8

    .line 194
    .line 195
    :goto_4
    return v3

    .line 196
    :cond_8
    iget-boolean v4, v1, LU3/g;->h:Z

    .line 197
    .line 198
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    if-nez v4, :cond_b

    .line 204
    .line 205
    iget-wide v10, v1, LU3/g;->i:J

    .line 206
    .line 207
    cmp-long v4, v10, v5

    .line 208
    .line 209
    if-nez v4, :cond_9

    .line 210
    .line 211
    iget-wide v10, v0, LU3/i;->d:J

    .line 212
    .line 213
    iput-wide v10, v1, LU3/g;->i:J

    .line 214
    .line 215
    :cond_9
    iget v4, v1, LU3/g;->j:I

    .line 216
    .line 217
    if-ne v4, v2, :cond_a

    .line 218
    .line 219
    iget v2, v0, LU3/i;->c:I

    .line 220
    .line 221
    iput v2, v1, LU3/g;->j:I

    .line 222
    .line 223
    :cond_a
    iget-object v2, v1, LU3/g;->a:LV3/h;

    .line 224
    .line 225
    iget-wide v10, v1, LU3/g;->i:J

    .line 226
    .line 227
    invoke-interface {v2, v10, v11}, LV3/h;->c(J)V

    .line 228
    .line 229
    .line 230
    const/4 v2, 0x1

    .line 231
    iput-boolean v2, v1, LU3/g;->h:Z

    .line 232
    .line 233
    :cond_b
    iget-object v2, v1, LU3/g;->e:Ljava/lang/Object;

    .line 234
    .line 235
    monitor-enter v2

    .line 236
    :try_start_0
    iget-boolean v4, v1, LU3/g;->k:Z

    .line 237
    .line 238
    if-eqz v4, :cond_c

    .line 239
    .line 240
    iget-wide v7, v1, LU3/g;->l:J

    .line 241
    .line 242
    cmp-long v0, v7, v5

    .line 243
    .line 244
    if-eqz v0, :cond_d

    .line 245
    .line 246
    iget-wide v7, v1, LU3/g;->m:J

    .line 247
    .line 248
    cmp-long v0, v7, v5

    .line 249
    .line 250
    if-eqz v0, :cond_d

    .line 251
    .line 252
    iget-object v0, v1, LU3/g;->f:LU3/k;

    .line 253
    .line 254
    invoke-virtual {v0}, LU3/k;->e()V

    .line 255
    .line 256
    .line 257
    iget-object v0, v1, LU3/g;->a:LV3/h;

    .line 258
    .line 259
    iget-wide v7, v1, LU3/g;->l:J

    .line 260
    .line 261
    iget-wide v9, v1, LU3/g;->m:J

    .line 262
    .line 263
    invoke-interface {v0, v7, v8, v9, v10}, LV3/h;->b(JJ)V

    .line 264
    .line 265
    .line 266
    iput-boolean v3, v1, LU3/g;->k:Z

    .line 267
    .line 268
    iput-wide v5, v1, LU3/g;->l:J

    .line 269
    .line 270
    iput-wide v5, v1, LU3/g;->m:J

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :catchall_0
    move-exception v0

    .line 274
    goto :goto_6

    .line 275
    :cond_c
    iget-object v4, v1, LU3/g;->c:LA4/r;

    .line 276
    .line 277
    iget-object v5, v0, LU3/i;->f:[B

    .line 278
    .line 279
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    array-length v6, v5

    .line 283
    invoke-virtual {v4, v6, v5}, LA4/r;->F(I[B)V

    .line 284
    .line 285
    .line 286
    iget-object v10, v1, LU3/g;->a:LV3/h;

    .line 287
    .line 288
    iget-object v11, v1, LU3/g;->c:LA4/r;

    .line 289
    .line 290
    iget-wide v12, v0, LU3/i;->d:J

    .line 291
    .line 292
    iget v14, v0, LU3/i;->c:I

    .line 293
    .line 294
    iget-boolean v15, v0, LU3/i;->a:Z

    .line 295
    .line 296
    invoke-interface/range {v10 .. v15}, LV3/h;->d(LA4/r;JIZ)V

    .line 297
    .line 298
    .line 299
    iget-object v0, v1, LU3/g;->f:LU3/k;

    .line 300
    .line 301
    invoke-virtual {v0, v8, v9}, LU3/k;->d(J)LU3/i;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    if-nez v0, :cond_c

    .line 306
    .line 307
    :cond_d
    :goto_5
    monitor-exit v2

    .line 308
    return v3

    .line 309
    :goto_6
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 310
    throw v0
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

.method public final i(Lq3/l;)V
    .locals 3

    .line 1
    iget-object v0, p0, LU3/g;->a:LV3/h;

    .line 2
    .line 3
    iget v1, p0, LU3/g;->d:I

    .line 4
    .line 5
    invoke-interface {v0, p1, v1}, LV3/h;->e(Lq3/l;I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lq3/l;->i()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lq3/m;

    .line 12
    .line 13
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lq3/m;-><init>(J)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0}, Lq3/l;->r(Lq3/r;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LU3/g;->g:Lq3/l;

    .line 25
    .line 26
    return-void
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

.method public final j(Lq3/k;)Z
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "RTP packets are transmitted in a packet stream do not support sniffing."

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
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
