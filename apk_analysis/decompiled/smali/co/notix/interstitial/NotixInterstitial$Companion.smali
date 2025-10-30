.class public final Lco/notix/interstitial/NotixInterstitial$Companion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/interstitial/NotixInterstitial;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/notix/interstitial/NotixInterstitial;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lco/notix/interstitial/NotixInterstitial$Companion;


# instance fields
.field private final synthetic $$delegate_0:Lco/notix/interstitial/NotixInterstitial;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/interstitial/NotixInterstitial$Companion;

    invoke-direct {v0}, Lco/notix/interstitial/NotixInterstitial$Companion;-><init>()V

    sput-object v0, Lco/notix/interstitial/NotixInterstitial$Companion;->$$INSTANCE:Lco/notix/interstitial/NotixInterstitial$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lco/notix/wq;->t()Lco/notix/tg;

    move-result-object v0

    iput-object v0, p0, Lco/notix/interstitial/NotixInterstitial$Companion;->$$delegate_0:Lco/notix/interstitial/NotixInterstitial;

    return-void
.end method


# virtual methods
.method public createLoader(J)Lco/notix/interstitial/InterstitialLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    iget-object v0, p0, Lco/notix/interstitial/NotixInterstitial$Companion;->$$delegate_0:Lco/notix/interstitial/NotixInterstitial;

    invoke-interface {v0, p1, p2}, Lco/notix/interstitial/NotixInterstitial;->createLoader(J)Lco/notix/interstitial/InterstitialLoader;

    move-result-object p1

    return-object p1
.end method

.method public createLoader(JLco/notix/domain/RequestVars;)Lco/notix/interstitial/InterstitialLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 2
    iget-object v0, p0, Lco/notix/interstitial/NotixInterstitial$Companion;->$$delegate_0:Lco/notix/interstitial/NotixInterstitial;

    invoke-interface {v0, p1, p2, p3}, Lco/notix/interstitial/NotixInterstitial;->createLoader(JLco/notix/domain/RequestVars;)Lco/notix/interstitial/InterstitialLoader;

    move-result-object p1

    return-object p1
.end method

.method public createLoader(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/interstitial/InterstitialLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 3
    iget-object v0, p0, Lco/notix/interstitial/NotixInterstitial$Companion;->$$delegate_0:Lco/notix/interstitial/NotixInterstitial;

    invoke-interface {v0, p1, p2, p3, p4}, Lco/notix/interstitial/NotixInterstitial;->createLoader(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/interstitial/InterstitialLoader;

    move-result-object p1

    return-object p1
.end method

.method public createLoader(JLjava/lang/Integer;)Lco/notix/interstitial/InterstitialLoader;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 4
    iget-object v0, p0, Lco/notix/interstitial/NotixInterstitial$Companion;->$$delegate_0:Lco/notix/interstitial/NotixInterstitial;

    invoke-interface {v0, p1, p2, p3}, Lco/notix/interstitial/NotixInterstitial;->createLoader(JLjava/lang/Integer;)Lco/notix/interstitial/InterstitialLoader;

    move-result-object p1

    return-object p1
.end method

.method public show(Lco/notix/interstitial/InterstitialData;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    const-string v0, "interstitialData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/interstitial/NotixInterstitial$Companion;->$$delegate_0:Lco/notix/interstitial/NotixInterstitial;

    invoke-interface {v0, p1}, Lco/notix/interstitial/NotixInterstitial;->show(Lco/notix/interstitial/InterstitialData;)V

    return-void
.end method

.method public show(Lco/notix/interstitial/InterstitialData;LO7/a;LO7/a;LO7/l;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/notix/interstitial/InterstitialData;",
            "LO7/a;",
            "LO7/a;",
            "LO7/l;",
            ")V"
        }
    .end annotation

    .line 4
    const-string v0, "interstitialData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/interstitial/NotixInterstitial$Companion;->$$delegate_0:Lco/notix/interstitial/NotixInterstitial;

    invoke-interface {v0, p1, p2, p3, p4}, Lco/notix/interstitial/NotixInterstitial;->show(Lco/notix/interstitial/InterstitialData;LO7/a;LO7/a;LO7/l;)V

    return-void
.end method

.method public show(Lco/notix/interstitial/InterstitialData;Lco/notix/interstitial/InterstitialButton;)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 2
    const-string v0, "interstitialData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/interstitial/NotixInterstitial$Companion;->$$delegate_0:Lco/notix/interstitial/NotixInterstitial;

    invoke-interface {v0, p1, p2}, Lco/notix/interstitial/NotixInterstitial;->show(Lco/notix/interstitial/InterstitialData;Lco/notix/interstitial/InterstitialButton;)V

    return-void
.end method

.method public show(Lco/notix/interstitial/InterstitialData;Lco/notix/interstitial/InterstitialButton;ZLO7/a;LO7/a;LO7/l;)V
    .locals 8
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/notix/interstitial/InterstitialData;",
            "Lco/notix/interstitial/InterstitialButton;",
            "Z",
            "LO7/a;",
            "LO7/a;",
            "LO7/l;",
            ")V"
        }
    .end annotation

    .line 3
    const-string v0, "interstitialData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/notix/interstitial/NotixInterstitial$Companion;->$$delegate_0:Lco/notix/interstitial/NotixInterstitial;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lco/notix/interstitial/NotixInterstitial;->show(Lco/notix/interstitial/InterstitialData;Lco/notix/interstitial/InterstitialButton;ZLO7/a;LO7/a;LO7/l;)V

    return-void
.end method
