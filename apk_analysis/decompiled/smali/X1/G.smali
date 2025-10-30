.class public final LX1/G;
.super LM1/o;
.source "SourceFile"


# instance fields
.field public final u:LJ1/y1;

.field public v:Lcom/anilab/domain/model/Movie;


# direct methods
.method public constructor <init>(LJ1/y1;LB7/a;)V
    .locals 2

    .line 1
    const-string v0, "itemClick"

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
    iput-object p1, p0, LX1/G;->u:LJ1/y1;

    .line 10
    .line 11
    new-instance v0, LI5/k;

    .line 12
    .line 13
    const/16 v1, 0xa

    .line 14
    .line 15
    invoke-direct {v0, p0, v1, p2}, LI5/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, LJ1/y1;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
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


# virtual methods
.method public final bridge synthetic r(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LX1/G;->s(Lcom/anilab/domain/model/Movie;)V

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

.method public final s(Lcom/anilab/domain/model/Movie;)V
    .locals 4

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LX1/G;->v:Lcom/anilab/domain/model/Movie;

    .line 7
    .line 8
    iget-object v0, p0, LX1/G;->u:LJ1/y1;

    .line 9
    .line 10
    iget-object v0, v0, LJ1/y1;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 11
    .line 12
    const-string v1, "imageMovie"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "313x438"

    .line 18
    .line 19
    const-string v2, "963x900"

    .line 20
    .line 21
    iget-object p1, p1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1, v1, v2}, LW7/l;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, LC1/h;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-direct {v2, v3}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, v2, LC1/h;->c:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v2, v0}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, LC1/h;->a()LC1/i;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {v1, p1}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 54
    .line 55
    .line 56
    return-void
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
.end method
