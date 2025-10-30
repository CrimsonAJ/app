.class public final Lco/notix/og;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/y8;

.field public final b:Lco/notix/mg;

.field public c:Lco/notix/callback/NotixCallbackHandler;


# direct methods
.method public constructor <init>(Lco/notix/d9;Lco/notix/mg;)V
    .locals 1

    const-string v0, "contextProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notixCallbackExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/og;->a:Lco/notix/y8;

    iput-object p2, p0, Lco/notix/og;->b:Lco/notix/mg;

    return-void
.end method


# virtual methods
.method public final a(Lco/notix/callback/NotixCallback;)V
    .locals 3

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lco/notix/og;->b:Lco/notix/mg;

    .line 7
    .line 8
    iget-object v0, v0, Lco/notix/mg;->a:LY7/z;

    .line 9
    .line 10
    new-instance v1, Lco/notix/ng;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v2, p0, p1}, Lco/notix/ng;-><init>(LE7/d;Lco/notix/og;Lco/notix/callback/NotixCallback;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    invoke-static {v0, v2, v1, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 18
    .line 19
    .line 20
    return-void
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
