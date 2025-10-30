.class public final synthetic Lb5/K0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb5/S0;


# direct methods
.method public synthetic constructor <init>(Lb5/S0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb5/K0;->a:I

    iput-object p1, p0, Lb5/K0;->b:Lb5/S0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lb5/K0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/K0;->b:Lb5/S0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lb5/S0;->t0()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, Lb5/K0;->b:Lb5/S0;

    .line 13
    .line 14
    iget-object v0, v0, Lb5/S0;->r:Ls4/i;

    .line 15
    .line 16
    iget-object v1, v0, Ls4/i;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lb5/n0;

    .line 19
    .line 20
    iget-object v2, v1, Lb5/n0;->j:Lb5/m0;

    .line 21
    .line 22
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Lb5/m0;->l0()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ls4/i;->a0()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0}, Ls4/i;->b0()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const-string v2, "_cc"

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    iget-object v4, v1, Lb5/n0;->p:Lb5/S0;

    .line 44
    .line 45
    iget-object v5, v1, Lb5/n0;->h:Lb5/e0;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-static {v5}, Lb5/n0;->d(LD/n;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v5, Lb5/e0;->x:LA6/t;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, LA6/t;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, Landroid/os/Bundle;

    .line 58
    .line 59
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v1, "source"

    .line 63
    .line 64
    const-string v3, "(not set)"

    .line 65
    .line 66
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string v1, "medium"

    .line 70
    .line 71
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v1, "_cis"

    .line 75
    .line 76
    const-string v3, "intent"

    .line 77
    .line 78
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-wide/16 v6, 0x1

    .line 82
    .line 83
    invoke-virtual {v0, v2, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 84
    .line 85
    .line 86
    invoke-static {v4}, Lb5/n0;->e(Lb5/B;)V

    .line 87
    .line 88
    .line 89
    const-string v1, "auto"

    .line 90
    .line 91
    const-string v2, "_cmpx"

    .line 92
    .line 93
    invoke-virtual {v4, v1, v2, v0}, Lb5/S0;->w0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :cond_1
    invoke-static {v5}, Lb5/n0;->d(LD/n;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v5, Lb5/e0;->x:LA6/t;

    .line 102
    .line 103
    invoke-virtual {v0}, LA6/t;->m()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    if-eqz v7, :cond_2

    .line 112
    .line 113
    iget-object v1, v1, Lb5/n0;->i:Lb5/V;

    .line 114
    .line 115
    invoke-static {v1}, Lb5/n0;->f(Lb5/x0;)V

    .line 116
    .line 117
    .line 118
    const-string v2, "Cache still valid but referrer not found"

    .line 119
    .line 120
    iget-object v1, v1, Lb5/V;->g:Lb5/T;

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Lb5/T;->b(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_2
    iget-object v1, v5, Lb5/e0;->y:Lb5/c0;

    .line 127
    .line 128
    invoke-virtual {v1}, Lb5/c0;->f()J

    .line 129
    .line 130
    .line 131
    move-result-wide v7

    .line 132
    const-wide/32 v9, 0x36ee80

    .line 133
    .line 134
    .line 135
    div-long/2addr v7, v9

    .line 136
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    new-instance v6, Landroid/os/Bundle;

    .line 141
    .line 142
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 143
    .line 144
    .line 145
    new-instance v11, Landroid/util/Pair;

    .line 146
    .line 147
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    invoke-direct {v11, v12, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object v12

    .line 158
    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    if-eqz v13, :cond_3

    .line 167
    .line 168
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    check-cast v13, Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v1, v13}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v14

    .line 178
    invoke-virtual {v6, v13, v14}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_3
    const-wide/16 v12, -0x1

    .line 183
    .line 184
    add-long/2addr v7, v12

    .line 185
    mul-long/2addr v7, v9

    .line 186
    iget-object v1, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, Landroid/os/Bundle;

    .line 189
    .line 190
    invoke-virtual {v1, v2, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 191
    .line 192
    .line 193
    iget-object v1, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 194
    .line 195
    if-nez v1, :cond_4

    .line 196
    .line 197
    const-string v1, "app"

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_4
    check-cast v1, Ljava/lang/String;

    .line 201
    .line 202
    :goto_1
    invoke-static {v4}, Lb5/n0;->e(Lb5/B;)V

    .line 203
    .line 204
    .line 205
    iget-object v2, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v2, Landroid/os/Bundle;

    .line 208
    .line 209
    const-string v6, "_cmp"

    .line 210
    .line 211
    invoke-virtual {v4, v1, v6, v2}, Lb5/S0;->w0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 212
    .line 213
    .line 214
    :goto_2
    invoke-virtual {v0, v3}, LA6/t;->n(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :goto_3
    invoke-static {v5}, Lb5/n0;->d(LD/n;)V

    .line 218
    .line 219
    .line 220
    iget-object v0, v5, Lb5/e0;->y:Lb5/c0;

    .line 221
    .line 222
    const-wide/16 v1, 0x0

    .line 223
    .line 224
    invoke-virtual {v0, v1, v2}, Lb5/c0;->g(J)V

    .line 225
    .line 226
    .line 227
    :goto_4
    return-void

    .line 228
    :pswitch_1
    iget-object v0, p0, Lb5/K0;->b:Lb5/S0;

    .line 229
    .line 230
    invoke-virtual {v0}, Lb5/S0;->t0()V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :pswitch_2
    iget-object v0, p0, Lb5/K0;->b:Lb5/S0;

    .line 235
    .line 236
    invoke-virtual {v0}, Lb5/A;->l0()V

    .line 237
    .line 238
    .line 239
    iget-object v1, v0, LD/n;->a:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v1, Lb5/n0;

    .line 242
    .line 243
    iget-object v2, v1, Lb5/n0;->h:Lb5/e0;

    .line 244
    .line 245
    invoke-static {v2}, Lb5/n0;->d(LD/n;)V

    .line 246
    .line 247
    .line 248
    iget-object v2, v2, Lb5/e0;->u:Lb5/b0;

    .line 249
    .line 250
    invoke-virtual {v2}, Lb5/b0;->b()Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    iget-object v3, v1, Lb5/n0;->i:Lb5/V;

    .line 255
    .line 256
    if-nez v2, :cond_7

    .line 257
    .line 258
    iget-object v2, v1, Lb5/n0;->h:Lb5/e0;

    .line 259
    .line 260
    invoke-static {v2}, Lb5/n0;->d(LD/n;)V

    .line 261
    .line 262
    .line 263
    iget-object v4, v2, Lb5/e0;->v:Lb5/c0;

    .line 264
    .line 265
    invoke-virtual {v4}, Lb5/c0;->f()J

    .line 266
    .line 267
    .line 268
    move-result-wide v5

    .line 269
    const-wide/16 v7, 0x1

    .line 270
    .line 271
    add-long/2addr v7, v5

    .line 272
    invoke-virtual {v4, v7, v8}, Lb5/c0;->g(J)V

    .line 273
    .line 274
    .line 275
    const-wide/16 v7, 0x5

    .line 276
    .line 277
    cmp-long v4, v5, v7

    .line 278
    .line 279
    if-ltz v4, :cond_5

    .line 280
    .line 281
    invoke-static {v3}, Lb5/n0;->f(Lb5/x0;)V

    .line 282
    .line 283
    .line 284
    const-string v0, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."

    .line 285
    .line 286
    iget-object v1, v3, Lb5/V;->i:Lb5/T;

    .line 287
    .line 288
    invoke-virtual {v1, v0}, Lb5/T;->b(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    iget-object v0, v2, Lb5/e0;->u:Lb5/b0;

    .line 292
    .line 293
    const/4 v1, 0x1

    .line 294
    invoke-virtual {v0, v1}, Lb5/b0;->a(Z)V

    .line 295
    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_5
    iget-object v2, v0, Lb5/S0;->t:Lb5/M0;

    .line 299
    .line 300
    if-nez v2, :cond_6

    .line 301
    .line 302
    new-instance v2, Lb5/M0;

    .line 303
    .line 304
    const/4 v3, 0x3

    .line 305
    invoke-direct {v2, v0, v1, v3}, Lb5/M0;-><init>(Lb5/S0;Lb5/y0;I)V

    .line 306
    .line 307
    .line 308
    iput-object v2, v0, Lb5/S0;->t:Lb5/M0;

    .line 309
    .line 310
    :cond_6
    iget-object v0, v0, Lb5/S0;->t:Lb5/M0;

    .line 311
    .line 312
    const-wide/16 v1, 0x0

    .line 313
    .line 314
    invoke-virtual {v0, v1, v2}, Lb5/o;->c(J)V

    .line 315
    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_7
    invoke-static {v3}, Lb5/n0;->f(Lb5/x0;)V

    .line 319
    .line 320
    .line 321
    const-string v0, "Deferred Deep Link already retrieved. Not fetching again."

    .line 322
    .line 323
    iget-object v1, v3, Lb5/V;->m:Lb5/T;

    .line 324
    .line 325
    invoke-virtual {v1, v0}, Lb5/T;->b(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :goto_5
    return-void

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
