.class public final Lco/notix/pg;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/google/firebase/messaging/r;

.field public final synthetic c:Lco/notix/push/firebase/NotixFirebaseMessagingService;


# direct methods
.method public constructor <init>(Lcom/google/firebase/messaging/r;Lco/notix/push/firebase/NotixFirebaseMessagingService;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 2
    .line 3
    iput-object p2, p0, Lco/notix/pg;->c:Lco/notix/push/firebase/NotixFirebaseMessagingService;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, LG7/j;-><init>(ILE7/d;)V

    .line 7
    .line 8
    .line 9
    return-void
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 2

    .line 1
    new-instance p1, Lco/notix/pg;

    .line 2
    .line 3
    iget-object v0, p0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 4
    .line 5
    iget-object v1, p0, Lco/notix/pg;->c:Lco/notix/push/firebase/NotixFirebaseMessagingService;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lco/notix/pg;-><init>(Lcom/google/firebase/messaging/r;Lco/notix/push/firebase/NotixFirebaseMessagingService;LE7/d;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lco/notix/pg;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lco/notix/pg;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lco/notix/pg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, LF7/a;->a:LF7/a;

    .line 4
    .line 5
    iget v2, v0, Lco/notix/pg;->a:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v3, :cond_0

    .line 11
    .line 12
    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto/16 :goto_7

    .line 16
    .line 17
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :cond_1
    invoke-static/range {p1 .. p1}, La/a;->A(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v4, Lco/notix/we;

    .line 29
    .line 30
    iget-object v2, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v5, "color"

    .line 37
    .line 38
    check-cast v2, Ls/e;

    .line 39
    .line 40
    invoke-virtual {v2, v5}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-static {v2}, LW7/k;->E(Ljava/lang/String;)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 v2, 0x0

    .line 54
    :goto_0
    iget-object v6, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 55
    .line 56
    invoke-virtual {v6}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const-string v7, "event"

    .line 61
    .line 62
    check-cast v6, Ls/e;

    .line 63
    .line 64
    invoke-virtual {v6, v7}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, Ljava/lang/String;

    .line 69
    .line 70
    iget-object v7, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 71
    .line 72
    invoke-virtual {v7}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    const-string v8, "icon_url"

    .line 77
    .line 78
    check-cast v7, Ls/e;

    .line 79
    .line 80
    invoke-virtual {v7, v8}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Ljava/lang/String;

    .line 85
    .line 86
    iget-object v8, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 87
    .line 88
    invoke-virtual {v8}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    const-string v9, "image_url"

    .line 93
    .line 94
    check-cast v8, Ls/e;

    .line 95
    .line 96
    invoke-virtual {v8, v9}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    check-cast v8, Ljava/lang/String;

    .line 101
    .line 102
    iget-object v9, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 103
    .line 104
    iget-object v9, v9, Lcom/google/firebase/messaging/r;->a:Landroid/os/Bundle;

    .line 105
    .line 106
    const-string v10, "google.delivered_priority"

    .line 107
    .line 108
    invoke-virtual {v9, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    const/4 v11, 0x2

    .line 113
    if-nez v10, :cond_4

    .line 114
    .line 115
    const-string v10, "google.priority_reduced"

    .line 116
    .line 117
    invoke-virtual {v9, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    const-string v12, "1"

    .line 122
    .line 123
    invoke-virtual {v12, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v10

    .line 127
    if-eqz v10, :cond_3

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    const-string v10, "google.priority"

    .line 131
    .line 132
    invoke-virtual {v9, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    :cond_4
    const-string v9, "high"

    .line 137
    .line 138
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    if-eqz v9, :cond_5

    .line 143
    .line 144
    move v11, v3

    .line 145
    goto :goto_1

    .line 146
    :cond_5
    const-string v9, "normal"

    .line 147
    .line 148
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    if-eqz v9, :cond_6

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_6
    const/4 v11, 0x0

    .line 156
    :goto_1
    new-instance v9, Ljava/lang/Integer;

    .line 157
    .line 158
    invoke-direct {v9, v11}, Ljava/lang/Integer;-><init>(I)V

    .line 159
    .line 160
    .line 161
    iget-object v10, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 162
    .line 163
    invoke-virtual {v10}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    const-string v11, "show_badge_icon"

    .line 168
    .line 169
    check-cast v10, Ls/e;

    .line 170
    .line 171
    invoke-virtual {v10, v11}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    check-cast v10, Ljava/lang/String;

    .line 176
    .line 177
    if-eqz v10, :cond_7

    .line 178
    .line 179
    invoke-static {v10}, LW7/d;->i0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    goto :goto_2

    .line 184
    :cond_7
    const/4 v10, 0x0

    .line 185
    :goto_2
    iget-object v11, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 186
    .line 187
    invoke-virtual {v11}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 188
    .line 189
    .line 190
    move-result-object v11

    .line 191
    const-string v12, "show_only_last_notification"

    .line 192
    .line 193
    check-cast v11, Ls/e;

    .line 194
    .line 195
    invoke-virtual {v11, v12}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    check-cast v11, Ljava/lang/String;

    .line 200
    .line 201
    if-eqz v11, :cond_8

    .line 202
    .line 203
    invoke-static {v11}, LW7/d;->i0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    goto :goto_3

    .line 208
    :cond_8
    const/4 v11, 0x0

    .line 209
    :goto_3
    iget-object v12, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 210
    .line 211
    invoke-virtual {v12}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 212
    .line 213
    .line 214
    move-result-object v12

    .line 215
    const-string v13, "show_toast"

    .line 216
    .line 217
    check-cast v12, Ls/e;

    .line 218
    .line 219
    invoke-virtual {v12, v13}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    check-cast v12, Ljava/lang/String;

    .line 224
    .line 225
    if-eqz v12, :cond_9

    .line 226
    .line 227
    invoke-static {v12}, LW7/d;->i0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 228
    .line 229
    .line 230
    move-result-object v12

    .line 231
    goto :goto_4

    .line 232
    :cond_9
    const/4 v12, 0x0

    .line 233
    :goto_4
    iget-object v13, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 234
    .line 235
    invoke-virtual {v13}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 236
    .line 237
    .line 238
    move-result-object v13

    .line 239
    const-string v14, "title"

    .line 240
    .line 241
    check-cast v13, Ls/e;

    .line 242
    .line 243
    invoke-virtual {v13, v14}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    check-cast v13, Ljava/lang/String;

    .line 248
    .line 249
    iget-object v14, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 250
    .line 251
    invoke-virtual {v14}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 252
    .line 253
    .line 254
    move-result-object v14

    .line 255
    const-string v15, "text"

    .line 256
    .line 257
    check-cast v14, Ls/e;

    .line 258
    .line 259
    invoke-virtual {v14, v15}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v14

    .line 263
    check-cast v14, Ljava/lang/String;

    .line 264
    .line 265
    iget-object v15, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 266
    .line 267
    invoke-virtual {v15}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 268
    .line 269
    .line 270
    move-result-object v15

    .line 271
    const-string v5, "importance"

    .line 272
    .line 273
    check-cast v15, Ls/e;

    .line 274
    .line 275
    invoke-virtual {v15, v5}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    check-cast v5, Ljava/lang/String;

    .line 280
    .line 281
    if-eqz v5, :cond_a

    .line 282
    .line 283
    invoke-static {v5}, LW7/k;->E(Ljava/lang/String;)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    move-object v15, v5

    .line 288
    goto :goto_5

    .line 289
    :cond_a
    const/4 v15, 0x0

    .line 290
    :goto_5
    iget-object v5, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 291
    .line 292
    invoke-virtual {v5}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    const-string v3, "random_group_id"

    .line 297
    .line 298
    check-cast v5, Ls/e;

    .line 299
    .line 300
    invoke-virtual {v5, v3}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    check-cast v3, Ljava/lang/String;

    .line 305
    .line 306
    if-eqz v3, :cond_b

    .line 307
    .line 308
    invoke-static {v3}, LW7/d;->i0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    move-object/from16 v16, v5

    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_b
    const/16 v16, 0x0

    .line 316
    .line 317
    :goto_6
    iget-object v3, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 318
    .line 319
    invoke-virtual {v3}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    const-string v5, "click_data"

    .line 324
    .line 325
    check-cast v3, Ls/e;

    .line 326
    .line 327
    invoke-virtual {v3, v5}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    move-object/from16 v17, v3

    .line 332
    .line 333
    check-cast v17, Ljava/lang/String;

    .line 334
    .line 335
    iget-object v3, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 336
    .line 337
    invoke-virtual {v3}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    const-string v5, "impression_data"

    .line 342
    .line 343
    check-cast v3, Ls/e;

    .line 344
    .line 345
    invoke-virtual {v3, v5}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    move-object/from16 v18, v3

    .line 350
    .line 351
    check-cast v18, Ljava/lang/String;

    .line 352
    .line 353
    iget-object v3, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 354
    .line 355
    invoke-virtual {v3}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    const-string v5, "pd"

    .line 360
    .line 361
    check-cast v3, Ls/e;

    .line 362
    .line 363
    invoke-virtual {v3, v5}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    move-object/from16 v19, v3

    .line 368
    .line 369
    check-cast v19, Ljava/lang/String;

    .line 370
    .line 371
    iget-object v3, v0, Lco/notix/pg;->b:Lcom/google/firebase/messaging/r;

    .line 372
    .line 373
    invoke-virtual {v3}, Lcom/google/firebase/messaging/r;->f()Ljava/util/Map;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    const-string v5, "target_url"

    .line 378
    .line 379
    check-cast v3, Ls/e;

    .line 380
    .line 381
    invoke-virtual {v3, v5}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    move-object/from16 v20, v3

    .line 386
    .line 387
    check-cast v20, Ljava/lang/String;

    .line 388
    .line 389
    move-object v5, v2

    .line 390
    invoke-direct/range {v4 .. v20}, Lco/notix/we;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    move-object/from16 v3, v19

    .line 394
    .line 395
    sget-object v2, Lco/notix/md;->a:Lco/notix/kd;

    .line 396
    .line 397
    new-instance v5, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    const-string v6, "Push received title="

    .line 400
    .line 401
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const-string v6, ", text="

    .line 408
    .line 409
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    const-string v6, ", pingData="

    .line 416
    .line 417
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    invoke-virtual {v2, v3}, Lco/notix/kd;->a(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    iget-object v2, v0, Lco/notix/pg;->c:Lco/notix/push/firebase/NotixFirebaseMessagingService;

    .line 431
    .line 432
    iget-object v2, v2, Lco/notix/push/firebase/NotixFirebaseMessagingService;->c:Lco/notix/if;

    .line 433
    .line 434
    const/4 v3, 0x1

    .line 435
    iput v3, v0, Lco/notix/pg;->a:I

    .line 436
    .line 437
    invoke-virtual {v2, v4, v0}, Lco/notix/if;->a(Lco/notix/we;LE7/d;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    if-ne v2, v1, :cond_c

    .line 442
    .line 443
    return-object v1

    .line 444
    :cond_c
    :goto_7
    sget-object v1, LA7/n;->a:LA7/n;

    .line 445
    .line 446
    return-object v1
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
