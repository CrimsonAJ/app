.class public final Lk2/a;
.super LM1/o;
.source "SourceFile"


# instance fields
.field public final u:LJ1/K0;

.field public final synthetic v:Lk2/b;


# direct methods
.method public constructor <init>(Lk2/b;LJ1/K0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk2/a;->v:Lk2/b;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LM1/o;-><init>(LW/g;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lk2/a;->u:LJ1/K0;

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
    check-cast p1, LH2/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lk2/a;->s(LH2/b;)V

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

.method public final s(LH2/b;)V
    .locals 5

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LF0/r0;->a:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, LF0/r0;->c()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Lk2/a;->v:Lk2/b;

    .line 17
    .line 18
    iget v3, v2, Lk2/b;->f:I

    .line 19
    .line 20
    if-ne v1, v3, :cond_0

    .line 21
    .line 22
    const v1, 0x7f060382

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const v1, 0x7f060063

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v1, p0, Lk2/a;->u:LJ1/K0;

    .line 34
    .line 35
    iget-object v3, v1, LJ1/K0;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 36
    .line 37
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 38
    .line 39
    .line 40
    iget-object v3, v1, LJ1/K0;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 41
    .line 42
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p1, LH2/b;->a:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v4, v1, LJ1/K0;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 48
    .line 49
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    iget v0, p1, LH2/b;->b:I

    .line 53
    .line 54
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, LF0/r0;->c()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget v3, v2, Lk2/b;->f:I

    .line 66
    .line 67
    if-ne v0, v3, :cond_1

    .line 68
    .line 69
    const v0, 0x7f080091

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const v0, 0x7f080080

    .line 74
    .line 75
    .line 76
    :goto_1
    iget-object v3, v1, LW/g;->k:Landroid/view/View;

    .line 77
    .line 78
    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 79
    .line 80
    .line 81
    new-instance v0, LN1/e;

    .line 82
    .line 83
    const/4 v4, 0x3

    .line 84
    invoke-direct {v0, v2, p0, p1, v4}, LN1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, LW/g;->c0()V

    .line 91
    .line 92
    .line 93
    return-void
    .line 94
    .line 95
    .line 96
.end method
