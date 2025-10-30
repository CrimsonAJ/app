.class public final LP1/b;
.super LM1/o;
.source "SourceFile"


# instance fields
.field public final u:LJ1/O0;

.field public final v:Lcom/anilab/android/ui/comment/CommentListFragment;


# direct methods
.method public constructor <init>(LJ1/O0;Lcom/anilab/android/ui/comment/CommentListFragment;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LM1/o;-><init>(LW/g;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LP1/b;->u:LJ1/O0;

    .line 10
    .line 11
    iput-object p2, p0, LP1/b;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 12
    .line 13
    return-void
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
    check-cast p1, LH2/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LP1/b;->s(LH2/c;)V

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

.method public final s(LH2/c;)V
    .locals 12

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v3, p0, LP1/b;->u:LJ1/O0;

    .line 5
    .line 6
    iget-object v4, v3, LJ1/O0;->A:Landroidx/appcompat/widget/AppCompatTextView;

    .line 7
    .line 8
    iget-object v5, p1, LH2/c;->d:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object v4, v3, LJ1/O0;->x:Landroidx/appcompat/widget/AppCompatTextView;

    .line 14
    .line 15
    const-string v5, "buttonNumberReply"

    .line 16
    .line 17
    invoke-static {v4, v5}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget v5, p1, LH2/c;->f:I

    .line 21
    .line 22
    if-lez v5, :cond_0

    .line 23
    .line 24
    move v6, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v6, v1

    .line 27
    :goto_0
    const/16 v7, 0x8

    .line 28
    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    move v6, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v6, v7

    .line 34
    :goto_1
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object v6, p0, LF0/r0;->a:Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    iget-boolean v8, p1, LH2/c;->p:Z

    .line 44
    .line 45
    if-eqz v8, :cond_2

    .line 46
    .line 47
    const v8, 0x7f1400ba

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const v8, 0x7f1400c1

    .line 52
    .line 53
    .line 54
    :goto_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    new-array v9, v2, [Ljava/lang/Object;

    .line 59
    .line 60
    aput-object v5, v9, v1

    .line 61
    .line 62
    invoke-virtual {v6, v8, v9}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    iget-object v5, p1, LH2/c;->i:LH2/y;

    .line 70
    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    iget-object v5, v5, LH2/y;->b:Ljava/lang/String;

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    const/4 v5, 0x0

    .line 77
    :goto_3
    iget-object v6, v3, LJ1/O0;->E:Landroidx/appcompat/widget/AppCompatTextView;

    .line 78
    .line 79
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    iget v5, p1, LH2/c;->e:I

    .line 83
    .line 84
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iget-object v6, v3, LJ1/O0;->B:Landroidx/appcompat/widget/AppCompatTextView;

    .line 89
    .line 90
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    iget-object v5, v3, LJ1/O0;->z:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 94
    .line 95
    const-string v6, "imageUser"

    .line 96
    .line 97
    invoke-static {v5, v6}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object v6, p1, LH2/c;->k:Ljava/lang/String;

    .line 101
    .line 102
    if-nez v6, :cond_4

    .line 103
    .line 104
    const-string v6, ""

    .line 105
    .line 106
    :cond_4
    const-string v8, "{width}x{height}"

    .line 107
    .line 108
    const-string v9, "150x150"

    .line 109
    .line 110
    invoke-static {v6, v8, v9}, LW7/l;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    invoke-static {v8}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    new-instance v9, LC1/h;

    .line 123
    .line 124
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-direct {v9, v10}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    iput-object v6, v9, LC1/h;->c:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {v9, v5}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 134
    .line 135
    .line 136
    new-instance v5, LF1/a;

    .line 137
    .line 138
    invoke-direct {v5}, LF1/a;-><init>()V

    .line 139
    .line 140
    .line 141
    new-array v6, v2, [LF1/c;

    .line 142
    .line 143
    aput-object v5, v6, v1

    .line 144
    .line 145
    invoke-static {v6}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    iput-object v5, v9, LC1/h;->e:Ljava/util/List;

    .line 154
    .line 155
    invoke-virtual {v9}, LC1/h;->a()LC1/i;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    invoke-virtual {v8, v5}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 160
    .line 161
    .line 162
    iget-object v5, p1, LH2/c;->j:Ljava/lang/Boolean;

    .line 163
    .line 164
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-static {v5, v6}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_5

    .line 171
    .line 172
    const v5, 0x7f0801ad

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_5
    const v5, 0x7f080267

    .line 177
    .line 178
    .line 179
    :goto_4
    iget-object v8, v3, LJ1/O0;->v:Lcom/google/android/material/button/MaterialButton;

    .line 180
    .line 181
    invoke-virtual {v8, v5}, Lcom/google/android/material/button/MaterialButton;->setIconResource(I)V

    .line 182
    .line 183
    .line 184
    new-instance v5, LP1/a;

    .line 185
    .line 186
    invoke-direct {v5, p1, p0}, LP1/a;-><init>(LH2/c;LP1/b;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 190
    .line 191
    .line 192
    iget-object v5, v3, LJ1/O0;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 193
    .line 194
    const-string v8, "buttonMoreOption"

    .line 195
    .line 196
    invoke-static {v5, v8}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    iget-object v8, p1, LH2/c;->l:Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-static {v8, v6}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-eqz v6, :cond_6

    .line 206
    .line 207
    move v7, v1

    .line 208
    :cond_6
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 209
    .line 210
    .line 211
    new-instance v6, LP1/a;

    .line 212
    .line 213
    invoke-direct {v6, p0, p1, v2}, LP1/a;-><init>(LP1/b;LH2/c;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 217
    .line 218
    .line 219
    iget-boolean v2, p1, LH2/c;->p:Z

    .line 220
    .line 221
    if-eqz v2, :cond_7

    .line 222
    .line 223
    const v2, 0x7f08015e

    .line 224
    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_7
    const v2, 0x7f08015b

    .line 228
    .line 229
    .line 230
    :goto_5
    invoke-virtual {v4, v1, v1, v2, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 231
    .line 232
    .line 233
    new-instance v1, LP1/a;

    .line 234
    .line 235
    const/4 v2, 0x2

    .line 236
    invoke-direct {v1, p0, p1, v2}, LP1/a;-><init>(LP1/b;LH2/c;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    .line 241
    .line 242
    new-instance v1, LP1/a;

    .line 243
    .line 244
    invoke-direct {v1, p0, p1, v0}, LP1/a;-><init>(LP1/b;LH2/c;I)V

    .line 245
    .line 246
    .line 247
    iget-object v2, v3, LJ1/O0;->y:Lcom/google/android/material/button/MaterialButton;

    .line 248
    .line 249
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 250
    .line 251
    .line 252
    new-instance v1, LP1/a;

    .line 253
    .line 254
    const/4 v2, 0x4

    .line 255
    invoke-direct {v1, p0, p1, v2}, LP1/a;-><init>(LP1/b;LH2/c;I)V

    .line 256
    .line 257
    .line 258
    iget-object v2, v3, LJ1/O0;->C:Landroidx/appcompat/widget/AppCompatTextView;

    .line 259
    .line 260
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 261
    .line 262
    .line 263
    const/16 v1, 0x3e8

    .line 264
    .line 265
    int-to-long v1, v1

    .line 266
    iget-wide v4, p1, LH2/c;->g:J

    .line 267
    .line 268
    mul-long v6, v4, v1

    .line 269
    .line 270
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 271
    .line 272
    .line 273
    move-result-wide v8

    .line 274
    const-wide/16 v10, 0x3e8

    .line 275
    .line 276
    invoke-static/range {v6 .. v11}, Landroid/text/format/DateUtils;->getRelativeTimeSpanString(JJJ)Ljava/lang/CharSequence;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    iget-object v1, v3, LJ1/O0;->D:Landroidx/appcompat/widget/AppCompatTextView;

    .line 281
    .line 282
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    new-instance p1, LK5/a;

    .line 286
    .line 287
    invoke-direct {p1, v0, p0}, LK5/a;-><init>(ILjava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    iget-object v0, v3, LW/g;->k:Landroid/view/View;

    .line 291
    .line 292
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3}, LW/g;->c0()V

    .line 296
    .line 297
    .line 298
    return-void
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
