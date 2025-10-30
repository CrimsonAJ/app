.class public final LF0/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    iput p2, p0, LF0/N;->a:I

    iput-object p1, p0, LF0/N;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, LF0/N;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    iget v4, v0, LF0/N;->a:I

    .line 7
    .line 8
    packed-switch v4, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v4, v2, Landroidx/recyclerview/widget/RecyclerView;->n0:LF0/Z;

    .line 12
    .line 13
    if-eqz v4, :cond_c

    .line 14
    .line 15
    check-cast v4, LF0/o;

    .line 16
    .line 17
    iget-object v5, v4, LF0/o;->h:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    iget-object v7, v4, LF0/o;->j:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    iget-object v9, v4, LF0/o;->k:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    iget-object v11, v4, LF0/o;->i:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    if-eqz v6, :cond_0

    .line 42
    .line 43
    if-eqz v8, :cond_0

    .line 44
    .line 45
    if-eqz v12, :cond_0

    .line 46
    .line 47
    if-eqz v10, :cond_0

    .line 48
    .line 49
    move-object/from16 v16, v2

    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v13

    .line 57
    move-object/from16 v16, v2

    .line 58
    .line 59
    const/4 v14, 0x0

    .line 60
    :goto_0
    iget-wide v1, v4, LF0/Z;->d:J

    .line 61
    .line 62
    if-ge v14, v13, :cond_1

    .line 63
    .line 64
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v17

    .line 68
    add-int/2addr v14, v3

    .line 69
    move-object/from16 v15, v17

    .line 70
    .line 71
    check-cast v15, LF0/r0;

    .line 72
    .line 73
    iget-object v3, v15, LF0/r0;->a:Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    move-object/from16 v18, v5

    .line 80
    .line 81
    iget-object v5, v4, LF0/o;->q:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const/4 v2, 0x0

    .line 91
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v2, LF0/j;

    .line 96
    .line 97
    invoke-direct {v2, v4, v15, v0, v3}, LF0/j;-><init>(LF0/o;LF0/r0;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 105
    .line 106
    .line 107
    move-object/from16 v0, p0

    .line 108
    .line 109
    move-object/from16 v5, v18

    .line 110
    .line 111
    const/4 v3, 0x1

    .line 112
    goto :goto_0

    .line 113
    :cond_1
    move-object/from16 v18, v5

    .line 114
    .line 115
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->clear()V

    .line 116
    .line 117
    .line 118
    if-nez v8, :cond_3

    .line 119
    .line 120
    new-instance v0, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 126
    .line 127
    .line 128
    iget-object v3, v4, LF0/o;->m:Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 134
    .line 135
    .line 136
    new-instance v3, LF0/i;

    .line 137
    .line 138
    const/4 v15, 0x0

    .line 139
    invoke-direct {v3, v4, v0, v15}, LF0/i;-><init>(LF0/o;Ljava/util/ArrayList;I)V

    .line 140
    .line 141
    .line 142
    if-nez v6, :cond_2

    .line 143
    .line 144
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, LF0/n;

    .line 149
    .line 150
    iget-object v0, v0, LF0/n;->a:LF0/r0;

    .line 151
    .line 152
    iget-object v0, v0, LF0/r0;->a:Landroid/view/View;

    .line 153
    .line 154
    sget-object v5, LP/Q;->a:Ljava/util/WeakHashMap;

    .line 155
    .line 156
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    invoke-virtual {v3}, LF0/i;->run()V

    .line 161
    .line 162
    .line 163
    :cond_3
    :goto_1
    if-nez v10, :cond_5

    .line 164
    .line 165
    new-instance v0, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 171
    .line 172
    .line 173
    iget-object v3, v4, LF0/o;->n:Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 179
    .line 180
    .line 181
    new-instance v3, LF0/i;

    .line 182
    .line 183
    const/4 v5, 0x1

    .line 184
    invoke-direct {v3, v4, v0, v5}, LF0/i;-><init>(LF0/o;Ljava/util/ArrayList;I)V

    .line 185
    .line 186
    .line 187
    if-nez v6, :cond_4

    .line 188
    .line 189
    const/4 v15, 0x0

    .line 190
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, LF0/m;

    .line 195
    .line 196
    iget-object v0, v0, LF0/m;->a:LF0/r0;

    .line 197
    .line 198
    iget-object v0, v0, LF0/r0;->a:Landroid/view/View;

    .line 199
    .line 200
    sget-object v5, LP/Q;->a:Ljava/util/WeakHashMap;

    .line 201
    .line 202
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_4
    invoke-virtual {v3}, LF0/i;->run()V

    .line 207
    .line 208
    .line 209
    :cond_5
    :goto_2
    if-nez v12, :cond_b

    .line 210
    .line 211
    new-instance v0, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 217
    .line 218
    .line 219
    iget-object v3, v4, LF0/o;->l:Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 225
    .line 226
    .line 227
    new-instance v3, LF0/i;

    .line 228
    .line 229
    const/4 v5, 0x2

    .line 230
    invoke-direct {v3, v4, v0, v5}, LF0/i;-><init>(LF0/o;Ljava/util/ArrayList;I)V

    .line 231
    .line 232
    .line 233
    if-eqz v6, :cond_7

    .line 234
    .line 235
    if-eqz v8, :cond_7

    .line 236
    .line 237
    if-nez v10, :cond_6

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_6
    invoke-virtual {v3}, LF0/i;->run()V

    .line 241
    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_7
    :goto_3
    const-wide/16 v11, 0x0

    .line 245
    .line 246
    if-nez v6, :cond_8

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_8
    move-wide v1, v11

    .line 250
    :goto_4
    if-nez v8, :cond_9

    .line 251
    .line 252
    iget-wide v5, v4, LF0/Z;->e:J

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_9
    move-wide v5, v11

    .line 256
    :goto_5
    if-nez v10, :cond_a

    .line 257
    .line 258
    iget-wide v11, v4, LF0/Z;->f:J

    .line 259
    .line 260
    :cond_a
    invoke-static {v5, v6, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 261
    .line 262
    .line 263
    move-result-wide v4

    .line 264
    add-long/2addr v4, v1

    .line 265
    const/4 v15, 0x0

    .line 266
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    check-cast v0, LF0/r0;

    .line 271
    .line 272
    iget-object v0, v0, LF0/r0;->a:Landroid/view/View;

    .line 273
    .line 274
    sget-object v1, LP/Q;->a:Ljava/util/WeakHashMap;

    .line 275
    .line 276
    invoke-virtual {v0, v3, v4, v5}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 277
    .line 278
    .line 279
    :cond_b
    :goto_6
    move-object/from16 v0, v16

    .line 280
    .line 281
    :goto_7
    const/4 v15, 0x0

    .line 282
    goto :goto_8

    .line 283
    :cond_c
    move-object v0, v2

    .line 284
    goto :goto_7

    .line 285
    :goto_8
    iput-boolean v15, v0, Landroidx/recyclerview/widget/RecyclerView;->L0:Z

    .line 286
    .line 287
    return-void

    .line 288
    :pswitch_0
    move-object v0, v2

    .line 289
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->u:Z

    .line 290
    .line 291
    if-eqz v1, :cond_10

    .line 292
    .line 293
    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-eqz v1, :cond_d

    .line 298
    .line 299
    goto :goto_9

    .line 300
    :cond_d
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    .line 301
    .line 302
    if-nez v1, :cond_e

    .line 303
    .line 304
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 305
    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_e
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->x:Z

    .line 309
    .line 310
    if-eqz v1, :cond_f

    .line 311
    .line 312
    const/4 v5, 0x1

    .line 313
    iput-boolean v5, v0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 314
    .line 315
    goto :goto_9

    .line 316
    :cond_f
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 317
    .line 318
    .line 319
    :cond_10
    :goto_9
    return-void

    .line 320
    nop

    .line 321
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
