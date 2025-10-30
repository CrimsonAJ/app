.class public final LA3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA3/i;


# instance fields
.field public final a:LA4/r;

.field public final b:Ll3/I;

.field public final c:Ljava/lang/String;

.field public d:Lq3/u;

.field public e:Ljava/lang/String;

.field public f:I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:J

.field public k:I

.field public l:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LA3/u;->f:I

    .line 6
    .line 7
    new-instance v1, LA4/r;

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    invoke-direct {v1, v2}, LA4/r;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, LA3/u;->a:LA4/r;

    .line 14
    .line 15
    iget-object v1, v1, LA4/r;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, [B

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    aput-byte v2, v1, v0

    .line 21
    .line 22
    new-instance v0, Ll3/I;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, LA3/u;->b:Ll3/I;

    .line 28
    .line 29
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    iput-wide v0, p0, LA3/u;->l:J

    .line 35
    .line 36
    iput-object p1, p0, LA3/u;->c:Ljava/lang/String;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LA3/u;->f:I

    .line 3
    .line 4
    iput v0, p0, LA3/u;->g:I

    .line 5
    .line 6
    iput-boolean v0, p0, LA3/u;->i:Z

    .line 7
    .line 8
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v0, p0, LA3/u;->l:J

    .line 14
    .line 15
    return-void
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

.method public final c(LA4/r;)V
    .locals 11

    .line 1
    iget-object v0, p0, LA3/u;->d:Lq3/u;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-virtual {p1}, LA4/r;->e()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_c

    .line 11
    .line 12
    iget v0, p0, LA3/u;->f:I

    .line 13
    .line 14
    iget-object v1, p0, LA3/u;->a:LA4/r;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x2

    .line 19
    if-eqz v0, :cond_7

    .line 20
    .line 21
    if-eq v0, v2, :cond_3

    .line 22
    .line 23
    if-ne v0, v4, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, LA4/r;->e()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v1, p0, LA3/u;->k:I

    .line 30
    .line 31
    iget v2, p0, LA3/u;->g:I

    .line 32
    .line 33
    sub-int/2addr v1, v2

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v1, p0, LA3/u;->d:Lq3/u;

    .line 39
    .line 40
    invoke-interface {v1, v0, p1}, Lq3/u;->c(ILA4/r;)V

    .line 41
    .line 42
    .line 43
    iget v1, p0, LA3/u;->g:I

    .line 44
    .line 45
    add-int/2addr v1, v0

    .line 46
    iput v1, p0, LA3/u;->g:I

    .line 47
    .line 48
    iget v8, p0, LA3/u;->k:I

    .line 49
    .line 50
    if-ge v1, v8, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-wide v5, p0, LA3/u;->l:J

    .line 54
    .line 55
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    cmp-long v0, v5, v0

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    iget-object v4, p0, LA3/u;->d:Lq3/u;

    .line 65
    .line 66
    const/4 v7, 0x1

    .line 67
    const/4 v9, 0x0

    .line 68
    const/4 v10, 0x0

    .line 69
    invoke-interface/range {v4 .. v10}, Lq3/u;->d(JIIILq3/t;)V

    .line 70
    .line 71
    .line 72
    iget-wide v0, p0, LA3/u;->l:J

    .line 73
    .line 74
    iget-wide v4, p0, LA3/u;->j:J

    .line 75
    .line 76
    add-long/2addr v0, v4

    .line 77
    iput-wide v0, p0, LA3/u;->l:J

    .line 78
    .line 79
    :cond_1
    iput v3, p0, LA3/u;->g:I

    .line 80
    .line 81
    iput v3, p0, LA3/u;->f:I

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_3
    invoke-virtual {p1}, LA4/r;->e()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget v5, p0, LA3/u;->g:I

    .line 95
    .line 96
    const/4 v6, 0x4

    .line 97
    rsub-int/lit8 v5, v5, 0x4

    .line 98
    .line 99
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget-object v5, v1, LA4/r;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v5, [B

    .line 106
    .line 107
    iget v7, p0, LA3/u;->g:I

    .line 108
    .line 109
    invoke-virtual {p1, v5, v7, v0}, LA4/r;->h([BII)V

    .line 110
    .line 111
    .line 112
    iget v5, p0, LA3/u;->g:I

    .line 113
    .line 114
    add-int/2addr v5, v0

    .line 115
    iput v5, p0, LA3/u;->g:I

    .line 116
    .line 117
    if-ge v5, v6, :cond_4

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    invoke-virtual {v1, v3}, LA4/r;->H(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, LA4/r;->i()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    iget-object v5, p0, LA3/u;->b:Ll3/I;

    .line 128
    .line 129
    invoke-virtual {v5, v0}, Ll3/I;->b(I)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_5

    .line 134
    .line 135
    iput v3, p0, LA3/u;->g:I

    .line 136
    .line 137
    iput v2, p0, LA3/u;->f:I

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :cond_5
    iget v0, v5, Ll3/I;->b:I

    .line 142
    .line 143
    iput v0, p0, LA3/u;->k:I

    .line 144
    .line 145
    iget-boolean v0, p0, LA3/u;->h:Z

    .line 146
    .line 147
    if-nez v0, :cond_6

    .line 148
    .line 149
    iget v0, v5, Ll3/I;->f:I

    .line 150
    .line 151
    int-to-long v7, v0

    .line 152
    const-wide/32 v9, 0xf4240

    .line 153
    .line 154
    .line 155
    mul-long/2addr v7, v9

    .line 156
    iget v0, v5, Ll3/I;->c:I

    .line 157
    .line 158
    int-to-long v9, v0

    .line 159
    div-long/2addr v7, v9

    .line 160
    iput-wide v7, p0, LA3/u;->j:J

    .line 161
    .line 162
    new-instance v7, Lj3/L;

    .line 163
    .line 164
    invoke-direct {v7}, Lj3/L;-><init>()V

    .line 165
    .line 166
    .line 167
    iget-object v8, p0, LA3/u;->e:Ljava/lang/String;

    .line 168
    .line 169
    iput-object v8, v7, Lj3/L;->a:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v8, v5, Ll3/I;->g:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v8, Ljava/lang/String;

    .line 174
    .line 175
    iput-object v8, v7, Lj3/L;->k:Ljava/lang/String;

    .line 176
    .line 177
    const/16 v8, 0x1000

    .line 178
    .line 179
    iput v8, v7, Lj3/L;->l:I

    .line 180
    .line 181
    iget v5, v5, Ll3/I;->d:I

    .line 182
    .line 183
    iput v5, v7, Lj3/L;->x:I

    .line 184
    .line 185
    iput v0, v7, Lj3/L;->y:I

    .line 186
    .line 187
    iget-object v0, p0, LA3/u;->c:Ljava/lang/String;

    .line 188
    .line 189
    iput-object v0, v7, Lj3/L;->c:Ljava/lang/String;

    .line 190
    .line 191
    new-instance v0, Lj3/M;

    .line 192
    .line 193
    invoke-direct {v0, v7}, Lj3/M;-><init>(Lj3/L;)V

    .line 194
    .line 195
    .line 196
    iget-object v5, p0, LA3/u;->d:Lq3/u;

    .line 197
    .line 198
    invoke-interface {v5, v0}, Lq3/u;->e(Lj3/M;)V

    .line 199
    .line 200
    .line 201
    iput-boolean v2, p0, LA3/u;->h:Z

    .line 202
    .line 203
    :cond_6
    invoke-virtual {v1, v3}, LA4/r;->H(I)V

    .line 204
    .line 205
    .line 206
    iget-object v0, p0, LA3/u;->d:Lq3/u;

    .line 207
    .line 208
    invoke-interface {v0, v6, v1}, Lq3/u;->c(ILA4/r;)V

    .line 209
    .line 210
    .line 211
    iput v4, p0, LA3/u;->f:I

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_7
    iget-object v0, p1, LA4/r;->c:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, [B

    .line 218
    .line 219
    iget v5, p1, LA4/r;->a:I

    .line 220
    .line 221
    iget v6, p1, LA4/r;->b:I

    .line 222
    .line 223
    :goto_1
    if-ge v5, v6, :cond_b

    .line 224
    .line 225
    aget-byte v7, v0, v5

    .line 226
    .line 227
    and-int/lit16 v8, v7, 0xff

    .line 228
    .line 229
    const/16 v9, 0xff

    .line 230
    .line 231
    if-ne v8, v9, :cond_8

    .line 232
    .line 233
    move v8, v2

    .line 234
    goto :goto_2

    .line 235
    :cond_8
    move v8, v3

    .line 236
    :goto_2
    iget-boolean v9, p0, LA3/u;->i:Z

    .line 237
    .line 238
    if-eqz v9, :cond_9

    .line 239
    .line 240
    and-int/lit16 v7, v7, 0xe0

    .line 241
    .line 242
    const/16 v9, 0xe0

    .line 243
    .line 244
    if-ne v7, v9, :cond_9

    .line 245
    .line 246
    move v7, v2

    .line 247
    goto :goto_3

    .line 248
    :cond_9
    move v7, v3

    .line 249
    :goto_3
    iput-boolean v8, p0, LA3/u;->i:Z

    .line 250
    .line 251
    if-eqz v7, :cond_a

    .line 252
    .line 253
    add-int/lit8 v6, v5, 0x1

    .line 254
    .line 255
    invoke-virtual {p1, v6}, LA4/r;->H(I)V

    .line 256
    .line 257
    .line 258
    iput-boolean v3, p0, LA3/u;->i:Z

    .line 259
    .line 260
    iget-object v1, v1, LA4/r;->c:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v1, [B

    .line 263
    .line 264
    aget-byte v0, v0, v5

    .line 265
    .line 266
    aput-byte v0, v1, v2

    .line 267
    .line 268
    iput v4, p0, LA3/u;->g:I

    .line 269
    .line 270
    iput v2, p0, LA3/u;->f:I

    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_a
    add-int/lit8 v5, v5, 0x1

    .line 275
    .line 276
    goto :goto_1

    .line 277
    :cond_b
    invoke-virtual {p1, v6}, LA4/r;->H(I)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :cond_c
    return-void
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
.end method

.method public final d()V
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

.method public final e(JI)V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long p3, p1, v0

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    iput-wide p1, p0, LA3/u;->l:J

    .line 11
    .line 12
    :cond_0
    return-void
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

.method public final f(Lq3/l;LA3/I;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, LA3/I;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LA3/I;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, LA3/I;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, LA3/u;->e:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, LA3/I;->b()V

    .line 12
    .line 13
    .line 14
    iget p2, p2, LA3/I;->d:I

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-interface {p1, p2, v0}, Lq3/l;->u(II)Lq3/u;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, LA3/u;->d:Lq3/u;

    .line 22
    .line 23
    return-void
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
