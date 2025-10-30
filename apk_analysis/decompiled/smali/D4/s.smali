.class public final LD4/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LD4/s;->a:I

    iput-object p3, p0, LD4/s;->c:Ljava/lang/Object;

    iput p1, p0, LD4/s;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILd1/l;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LD4/s;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LD4/s;->b:I

    .line 4
    iput-object p2, p0, LD4/s;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LH5/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LD4/s;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD4/s;->c:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 10
    iput p1, p0, LD4/s;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    const/4 p3, 0x4

    iput p3, p0, LD4/s;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const-string p3, "initCallbacks cannot be null"

    invoke-static {p1, p3}, Ls8/e;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p3, p0, LD4/s;->c:Ljava/lang/Object;

    .line 8
    iput p2, p0, LD4/s;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, LD4/s;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LD4/s;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lz5/c;

    .line 9
    .line 10
    iget v1, p0, LD4/s;->b:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lz5/c;->i(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, LD4/s;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ly4/v;

    .line 19
    .line 20
    iget-object v0, v0, Ly4/v;->C:Lu4/D;

    .line 21
    .line 22
    iget v1, p0, LD4/s;->b:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lu4/D;->b(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    iget-object v0, p0, LD4/s;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 31
    .line 32
    iget-object v0, v0, Landroidx/work/impl/foreground/SystemForegroundService;->e:Landroid/app/NotificationManager;

    .line 33
    .line 34
    iget v1, p0, LD4/s;->b:I

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_2
    iget-object v0, p0, LD4/s;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ld1/l;

    .line 43
    .line 44
    iget v1, p0, LD4/s;->b:I

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->k0(I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_3
    iget-object v0, p0, LD4/s;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iget v2, p0, LD4/s;->b:I

    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    const/4 v4, 0x0

    .line 62
    if-eq v2, v3, :cond_0

    .line 63
    .line 64
    :goto_0
    if-ge v4, v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ld0/g;

    .line 71
    .line 72
    invoke-virtual {v2}, Ld0/g;->a()V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    :goto_1
    if-ge v4, v1, :cond_1

    .line 79
    .line 80
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Ld0/g;

    .line 85
    .line 86
    invoke-virtual {v2}, Ld0/g;->b()V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v4, v4, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    return-void

    .line 93
    :pswitch_4
    iget-object v0, p0, LD4/s;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lcom/google/android/material/datepicker/j;

    .line 96
    .line 97
    iget-object v0, v0, Lcom/google/android/material/datepicker/j;->C0:Landroidx/recyclerview/widget/RecyclerView;

    .line 98
    .line 99
    iget v1, p0, LD4/s;->b:I

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->k0(I)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_5
    iget-object v0, p0, LD4/s;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lo1/f;

    .line 108
    .line 109
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, LG/b;

    .line 112
    .line 113
    if-eqz v0, :cond_2

    .line 114
    .line 115
    iget v1, p0, LD4/s;->b:I

    .line 116
    .line 117
    invoke-virtual {v0, v1}, LG/b;->h(I)V

    .line 118
    .line 119
    .line 120
    :cond_2
    return-void

    .line 121
    :pswitch_6
    iget-object v0, p0, LD4/s;->c:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, LH5/d;

    .line 124
    .line 125
    iget-object v0, v0, LH5/d;->h:LH5/b;

    .line 126
    .line 127
    iget v1, p0, LD4/s;->b:I

    .line 128
    .line 129
    const/4 v2, 0x4

    .line 130
    invoke-virtual {v0, v1, v2}, LV/b;->x(II)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_7
    iget-object v0, p0, LD4/s;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, LD4/t;

    .line 137
    .line 138
    iget v1, p0, LD4/s;->b:I

    .line 139
    .line 140
    invoke-virtual {v0, v1}, LD4/t;->i(I)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
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
.end method
