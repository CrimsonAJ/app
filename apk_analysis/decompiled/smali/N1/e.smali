.class public final synthetic LN1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LN1/e;->a:I

    iput-object p1, p0, LN1/e;->b:Ljava/lang/Object;

    iput-object p2, p0, LN1/e;->c:Ljava/lang/Object;

    iput-object p3, p0, LN1/e;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, LN1/e;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LN1/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, LH2/v;

    .line 9
    .line 10
    iget-object v0, p1, LH2/v;->j:Lcom/anilab/domain/model/Movie;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, p0, LN1/e;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lk2/f;

    .line 18
    .line 19
    iget-object v2, v1, Lk2/f;->f:LN1/i;

    .line 20
    .line 21
    iget-boolean v3, v0, Lcom/anilab/domain/model/Movie;->p:Z

    .line 22
    .line 23
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2, v0, v3}, LN1/i;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-boolean v2, v1, Lk2/f;->d:Z

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget-object p1, p1, LH2/v;->j:Lcom/anilab/domain/model/Movie;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-boolean v0, v0, Lcom/anilab/domain/model/Movie;->p:Z

    .line 39
    .line 40
    xor-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    iput-boolean v0, p1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 43
    .line 44
    :cond_1
    iget-object p1, p0, LN1/e;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lk2/e;

    .line 47
    .line 48
    invoke-virtual {p1}, LF0/r0;->c()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-virtual {v1, p1}, LF0/S;->e(I)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    return-void

    .line 56
    :pswitch_0
    iget-object p1, p0, LN1/e;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Lk2/b;

    .line 59
    .line 60
    iget v0, p1, Lk2/b;->f:I

    .line 61
    .line 62
    iget-object v1, p0, LN1/e;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lk2/a;

    .line 65
    .line 66
    invoke-virtual {v1}, LF0/r0;->c()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iput v1, p1, Lk2/b;->f:I

    .line 71
    .line 72
    invoke-virtual {p1, v0}, LF0/S;->e(I)V

    .line 73
    .line 74
    .line 75
    iget v0, p1, Lk2/b;->f:I

    .line 76
    .line 77
    invoke-virtual {p1, v0}, LF0/S;->e(I)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p1, Lk2/b;->d:LG0/h;

    .line 81
    .line 82
    iget-object v0, p0, LN1/e;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, LH2/b;

    .line 85
    .line 86
    invoke-virtual {p1, v0}, LG0/h;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_1
    iget-object p1, p0, LN1/e;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, LU1/m;

    .line 93
    .line 94
    iget-object v0, p1, LU1/m;->e:Ljava/util/ArrayList;

    .line 95
    .line 96
    iget-object v1, p0, LN1/e;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, Lcom/anilab/domain/model/Genre;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget-object v2, p1, LU1/m;->e:Ljava/util/ArrayList;

    .line 105
    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    :goto_1
    iget-object v0, p0, LN1/e;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, LN1/d;

    .line 118
    .line 119
    invoke-virtual {v0}, LF0/r0;->c()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-virtual {p1, v0}, LF0/S;->e(I)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_2
    iget-object p1, p0, LN1/e;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, LR1/C;

    .line 130
    .line 131
    iget-object v0, p1, LR1/C;->f:LB7/a;

    .line 132
    .line 133
    iget-object v1, p0, LN1/e;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v1, LH2/i;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, LB7/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    iget v0, p1, LR1/C;->h:I

    .line 141
    .line 142
    iget-object v1, p0, LN1/e;->d:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, LN1/d;

    .line 145
    .line 146
    invoke-virtual {v1}, LF0/r0;->b()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    iput v2, p1, LR1/C;->h:I

    .line 151
    .line 152
    invoke-virtual {p1, v0}, LF0/S;->e(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, LF0/r0;->b()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    invoke-virtual {p1, v0}, LF0/S;->e(I)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :pswitch_3
    iget-object p1, p0, LN1/e;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p1, LN1/f;

    .line 166
    .line 167
    iget-object v0, p1, LN1/f;->h:LN1/i;

    .line 168
    .line 169
    iget-object v1, p0, LN1/e;->c:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v1, Lcom/anilab/domain/model/Movie;

    .line 172
    .line 173
    iget-boolean v2, v1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 174
    .line 175
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v0, v1, v2}, LN1/i;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    iget-boolean v0, p1, LN1/f;->i:Z

    .line 183
    .line 184
    if-eqz v0, :cond_4

    .line 185
    .line 186
    iget-boolean v0, v1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 187
    .line 188
    xor-int/lit8 v0, v0, 0x1

    .line 189
    .line 190
    iput-boolean v0, v1, Lcom/anilab/domain/model/Movie;->p:Z

    .line 191
    .line 192
    iget-object v0, p0, LN1/e;->d:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, LN1/d;

    .line 195
    .line 196
    invoke-virtual {v0}, LF0/r0;->c()I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    invoke-virtual {p1, v0}, LF0/S;->e(I)V

    .line 201
    .line 202
    .line 203
    :cond_4
    return-void

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
