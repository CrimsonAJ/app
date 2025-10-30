.class public final synthetic LB7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LB7/a;->a:I

    iput-object p2, p0, LB7/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LB7/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/io/IOException;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iget-object v0, p0, LB7/a;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lv1/f;

    .line 12
    .line 13
    iput-boolean p1, v0, Lv1/f;->k:Z

    .line 14
    .line 15
    sget-object p1, LA7/n;->a:LA7/n;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 19
    .line 20
    iget-object v0, p0, LB7/a;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lcom/anilab/android/ui/home/HomeFragment;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lcom/anilab/android/ui/home/HomeFragment;->z0(Lcom/anilab/domain/model/Movie;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, LA7/n;->a:LA7/n;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    check-cast p1, LH2/i;

    .line 31
    .line 32
    const-string v0, "it"

    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, LB7/a;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lcom/anilab/android/ui/download/DownloadFragment;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/anilab/android/ui/download/DownloadFragment;->t0()LR1/A;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v1, LR1/y;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    iget-wide v3, p1, LH2/i;->a:J

    .line 53
    .line 54
    invoke-direct/range {v1 .. v6}, LR1/y;-><init>(LR1/A;JZLE7/d;)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    invoke-virtual {v2, p1, v1}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 59
    .line 60
    .line 61
    sget-object p1, LA7/n;->a:LA7/n;

    .line 62
    .line 63
    return-object p1

    .line 64
    :pswitch_2
    check-cast p1, LG0/a;

    .line 65
    .line 66
    const-string v0, "config"

    .line 67
    .line 68
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, LB7/a;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, LG0/E;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, LG0/E;->g(LG0/a;)LQ0/d;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :pswitch_3
    check-cast p1, LQ0/a;

    .line 81
    .line 82
    const-string v0, "db"

    .line 83
    .line 84
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, LB7/a;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, LG0/y;

    .line 90
    .line 91
    iput-object p1, v0, LG0/y;->g:LQ0/a;

    .line 92
    .line 93
    sget-object p1, LA7/n;->a:LA7/n;

    .line 94
    .line 95
    return-object p1

    .line 96
    :pswitch_4
    iget-object v0, p0, LB7/a;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, LB7/e;

    .line 99
    .line 100
    if-ne p1, v0, :cond_0

    .line 101
    .line 102
    const-string p1, "(this Collection)"

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_0
    return-object p1

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
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
.end method
