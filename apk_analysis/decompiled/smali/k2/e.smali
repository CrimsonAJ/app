.class public final Lk2/e;
.super LM1/o;
.source "SourceFile"


# instance fields
.field public final u:LJ1/o1;

.field public final synthetic v:Lk2/f;


# direct methods
.method public constructor <init>(Lk2/f;LJ1/o1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk2/e;->v:Lk2/f;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LM1/o;-><init>(LW/g;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lk2/e;->u:LJ1/o1;

    .line 7
    .line 8
    return-void
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


# virtual methods
.method public final bridge synthetic r(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LH2/v;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lk2/e;->s(LH2/v;)V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final s(LH2/v;)V
    .locals 13

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const-string v3, "item"

    .line 5
    .line 6
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v3, p1, LH2/v;->j:Lcom/anilab/domain/model/Movie;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    iget-boolean v4, v3, Lcom/anilab/domain/model/Movie;->p:Z

    .line 14
    .line 15
    if-ne v4, v1, :cond_0

    .line 16
    .line 17
    move v4, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v4, v2

    .line 20
    :goto_0
    iget-object v5, p0, Lk2/e;->u:LJ1/o1;

    .line 21
    .line 22
    iget-object v6, v5, LJ1/o1;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 23
    .line 24
    iget-object v7, p0, LF0/r0;->a:Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    iget-object v9, p1, LH2/v;->c:Ljava/lang/Integer;

    .line 31
    .line 32
    new-array v10, v1, [Ljava/lang/Object;

    .line 33
    .line 34
    aput-object v9, v10, v2

    .line 35
    .line 36
    const v9, 0x7f1400b8

    .line 37
    .line 38
    .line 39
    invoke-virtual {v8, v9, v10}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    iget-object v8, v3, Lcom/anilab/domain/model/Movie;->c:Ljava/lang/String;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object v8, v6

    .line 53
    :goto_1
    iget-object v9, v5, LJ1/o1;->y:Landroidx/appcompat/widget/AppCompatTextView;

    .line 54
    .line 55
    invoke-virtual {v9, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    iget-object v8, p1, LH2/v;->e:Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v8, :cond_3

    .line 61
    .line 62
    const-string v9, "yyyy-MM-dd\'T\'hh:mm:ss.SSS"

    .line 63
    .line 64
    invoke-static {v8}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    const-string v11, "N/A"

    .line 69
    .line 70
    if-eqz v10, :cond_2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    :try_start_0
    new-instance v10, Ljava/text/SimpleDateFormat;

    .line 74
    .line 75
    sget-object v12, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 76
    .line 77
    invoke-direct {v10, v9, v12}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 78
    .line 79
    .line 80
    const-string v9, "en"

    .line 81
    .line 82
    invoke-static {v9}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-virtual {v10, v9}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v10, v8}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    if-eqz v8, :cond_4

    .line 94
    .line 95
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-virtual {v9, v8}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 100
    .line 101
    .line 102
    const-string v8, "%02d:%02d"

    .line 103
    .line 104
    const/16 v10, 0xb

    .line 105
    .line 106
    invoke-virtual {v9, v10}, Ljava/util/Calendar;->get(I)I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    const/16 v12, 0xc

    .line 115
    .line 116
    invoke-virtual {v9, v12}, Ljava/util/Calendar;->get(I)I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    new-array v12, v0, [Ljava/lang/Object;

    .line 125
    .line 126
    aput-object v10, v12, v2

    .line 127
    .line 128
    aput-object v9, v12, v1

    .line 129
    .line 130
    invoke-static {v12, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v8, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    goto :goto_2

    .line 139
    :cond_3
    move-object v11, v6

    .line 140
    :catch_0
    :cond_4
    :goto_2
    iget-object v0, v5, LJ1/o1;->z:Landroidx/appcompat/widget/AppCompatTextView;

    .line 141
    .line 142
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, v5, LJ1/o1;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 146
    .line 147
    const-string v8, "imageMovie"

    .line 148
    .line 149
    invoke-static {v0, v8}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    if-eqz v3, :cond_5

    .line 153
    .line 154
    iget-object v6, v3, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 155
    .line 156
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-static {v3}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    new-instance v8, LC1/h;

    .line 165
    .line 166
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-direct {v8, v9}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 171
    .line 172
    .line 173
    iput-object v6, v8, LC1/h;->c:Ljava/lang/Object;

    .line 174
    .line 175
    invoke-virtual {v8, v0}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 176
    .line 177
    .line 178
    new-instance v0, LF1/b;

    .line 179
    .line 180
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    const v7, 0x7f0700b5

    .line 185
    .line 186
    .line 187
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    int-to-float v6, v6

    .line 192
    invoke-direct {v0, v6}, LF1/b;-><init>(F)V

    .line 193
    .line 194
    .line 195
    new-array v1, v1, [LF1/c;

    .line 196
    .line 197
    aput-object v0, v1, v2

    .line 198
    .line 199
    invoke-static {v1}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    iput-object v0, v8, LC1/h;->e:Ljava/util/List;

    .line 208
    .line 209
    invoke-virtual {v8}, LC1/h;->a()LC1/i;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v3, v0}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 214
    .line 215
    .line 216
    new-instance v0, LI5/k;

    .line 217
    .line 218
    iget-object v1, p0, Lk2/e;->v:Lk2/f;

    .line 219
    .line 220
    const/16 v2, 0x13

    .line 221
    .line 222
    invoke-direct {v0, p1, v2, v1}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    iget-object v2, v5, LJ1/o1;->B:Landroid/view/View;

    .line 226
    .line 227
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 228
    .line 229
    .line 230
    const v0, 0x106000d

    .line 231
    .line 232
    .line 233
    const v2, 0x7f060057

    .line 234
    .line 235
    .line 236
    if-eqz v4, :cond_6

    .line 237
    .line 238
    move v3, v2

    .line 239
    goto :goto_3

    .line 240
    :cond_6
    move v3, v0

    .line 241
    :goto_3
    iget-object v6, v5, LJ1/o1;->v:Lcom/google/android/material/button/MaterialButton;

    .line 242
    .line 243
    invoke-virtual {v6, v3}, Lcom/google/android/material/button/MaterialButton;->setStrokeColorResource(I)V

    .line 244
    .line 245
    .line 246
    iget-object v3, v5, LW/g;->k:Landroid/view/View;

    .line 247
    .line 248
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    if-eqz v4, :cond_7

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_7
    move v0, v2

    .line 256
    :goto_4
    invoke-virtual {v5, v0}, Landroid/content/Context;->getColor(I)I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    invoke-virtual {v6, v0}, Lcom/google/android/material/button/MaterialButton;->setBackgroundColor(I)V

    .line 261
    .line 262
    .line 263
    if-eqz v4, :cond_8

    .line 264
    .line 265
    const v0, 0x7f080263

    .line 266
    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_8
    const v0, 0x7f080156

    .line 270
    .line 271
    .line 272
    :goto_5
    invoke-virtual {v6, v0}, Lcom/google/android/material/button/MaterialButton;->setIconResource(I)V

    .line 273
    .line 274
    .line 275
    const v0, 0x106000b

    .line 276
    .line 277
    .line 278
    if-eqz v4, :cond_9

    .line 279
    .line 280
    move v5, v2

    .line 281
    goto :goto_6

    .line 282
    :cond_9
    move v5, v0

    .line 283
    :goto_6
    invoke-virtual {v6, v5}, Lcom/google/android/material/button/MaterialButton;->setIconTintResource(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    if-eqz v4, :cond_a

    .line 291
    .line 292
    goto :goto_7

    .line 293
    :cond_a
    move v2, v0

    .line 294
    :goto_7
    invoke-virtual {v3, v2}, Landroid/content/Context;->getColor(I)I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 299
    .line 300
    .line 301
    new-instance v0, LN1/e;

    .line 302
    .line 303
    const/4 v2, 0x4

    .line 304
    invoke-direct {v0, p1, v1, p0, v2}, LN1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 308
    .line 309
    .line 310
    return-void
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
